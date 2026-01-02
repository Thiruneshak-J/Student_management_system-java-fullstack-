import java.util.Scanner;
public class railwayReservationApp
{
    public static void main(String[] args)
    {
        boookingSystem book =new boookingSystem();
        book.addtrain(new train("12301", "pandianExpress", "madurai", "bangalore", 10, 5, 1500));
        book.addtrain(new train("12302", "cheranExpress", "cochin", "chennai", 12, 6, 2000));
        book.addtrain(new train("12303", "cholaExpress", "coimbatore", "bangalore", 10, 5, 1500));
        book.addtrain(new train("12304", "monkeyExpress", "madurai", "kolkata", 12, 6, 6000));
        book.addtrain(new train("12305", "pandianExpress", "madurai", "kolkata", 10, 5, 1500));


        Scanner sc=new Scanner(System.in);

        while(true)
        {
            try
            {
                System.out.println("--------------------------------------");
                System.out.println("-------------1.View Details-----------");
                System.out.println("-------------2.Book Train-------------");
                System.out.println("-------------3.Cancel Train-----------");
                System.out.println("-------------4.Check PNR--------------");
                System.out.println("-------------5.Exit-------------------");
                System.out.print("enter the Choice Below:");
                int ch=sc.nextInt();
                switch (ch)
                {
                    case 1:
                        book.displayAllTrain();
                        break;
                    case 2:
                        sc.nextLine();
                        System.out.print("Enter the Name:");
                        String name=sc.nextLine();
                        System.out.print("Enter the Age:");
                        int age=sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter the Gender:");
                        String gen=sc.nextLine();
                        System.out.print("Enter the Phone Number:");
                        String num=sc.nextLine();

                        passenger p=new passenger(name,age,gen,num);

                        System.out.print("Enter the Source:");
                        String src=sc.nextLine();
                        System.out.print("Enter the Destination:");
                        String des=sc.nextLine();
                        train t=book.searchTrain(src,des);
                        ticket ticket =book.bookTicket(p,t);
                        ticket.displayTicket();
                        break;
                    case 3:
                        System.out.print("Enter the PNR:");
                        String pnr=sc.next();
                        book.cancelTicket(pnr);
                        System.out.println("Ticket is Cancelled.refund processed");
                        break;
                    case 4:
                        System.out.print("Enter the PNR:");
                        book.checkPnrStatus(sc.next());
                        break;
                    case 5:
                        System.exit(0);

                }
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
            finally
            {
                System.out.println("THANK YOU FOR CHOOSING");
            }
        }
    }
}