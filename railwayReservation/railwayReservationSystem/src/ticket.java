import java.util.Random;
import java.time.LocalDate;
public class ticket
{
    private static int counter =1000;
    private int tic_id;
    private String pnr;
    private train train;
    private passenger passenger;
    private String b_date;
    private int seat_num;
    private String status;

    public ticket(train train,passenger passenger,int seat_num)
    {
        this.tic_id=counter++;
        this.train=train;
        this.passenger=passenger;
        this.seat_num=seat_num;
        this.status="CONFIRMED";
        generatepnr();
        bookingdate();
    }
    private void generatepnr()
    {
        Random r=new Random();
        pnr="PNR"+(100000+r.nextInt(900000));
    }
    private void bookingdate()
    {
        LocalDate today=LocalDate.now();
        this.b_date=today.toString();
    }
    public void displayTicket()
    {
        System.out.println("--------Ticket_Details---------");
        System.out.println("PNR              :"+pnr);
        System.out.println("Train Name       :"+train.gett_name());
        System.out.println("Date of Booking  :"+b_date);
        System.out.println("Seat Number      :"+seat_num);
        System.out.println("Status           :"+status);
        passenger.pass_info();
        System.out.println("--------------------------------");
    }
    public double calculateRefund()
    {
        return train.gett_price()*0.8;
    }
    public String getpnr()
    {
        return pnr;
    }
    public train gettrain()
    {
        return train;
    }
    public void setStatus(String status)
    {
        this.status=status;
    }


}
