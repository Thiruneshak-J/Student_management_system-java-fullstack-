import java.util.ArrayList;
import java.util.HashMap;
public class boookingSystem
{
    private ArrayList<train>trains=new ArrayList<>();
    private ArrayList<ticket>bookings=new ArrayList<>();
    private HashMap<String,ticket>pnrMap=new HashMap<>();
    public void addtrain(train train)
    {
        trains.add(train);
    }
    public train searchTrain(String source,String des)
            throws TrainNotFoundException
    {
        for(train t:trains)
        {
            if(t.getSource().equalsIgnoreCase(source) &&
                    t.getDes().equalsIgnoreCase(des))
            {
                return t;
            }
        }
        throw new TrainNotFoundException();
    }

    public synchronized ticket bookTicket(passenger p, train t)
            throws SeatNotAvailableException
    {
        if(t.getav_seats()==0)
        {
            throw new SeatNotAvailableException();
        }
        int seat_num=t.getav_seats();
        t.bookSet();
        ticket ticket=new ticket (t,p,seat_num);
        bookings.add(ticket);
        pnrMap.put(ticket.getpnr(),ticket);
        return ticket;
    }

    public synchronized void cancelTicket(String pnr)
            throws PnrException
    {
        ticket ticket =pnrMap.get(pnr);
        if(ticket==null)
        {
            throw new PnrException();
        }
        ticket.gettrain().cancelSeat();
        ticket.setStatus("CANCELLED");
    }
    public void checkPnrStatus(String pnr)
            throws PnrException
    {
        ticket t=pnrMap.get(pnr);
        if(t==null)
        {
            throw new PnrException();
        }
        t.displayTicket();
    }
    public void displayAllTrain()
    {
        for(train t:trains)
        {
            t.displayTrainInfo();
        }
    }
}
