public class train
{
        private String t_num;
        private String t_name;
        private String source;
        private String des;
        private int t_seats;
        private int av_seats;
        private double t_price;

    public train(String t_num,String t_name,String source,String des,
                 int t_seats,int av_seats,double t_price) // also can give train() ----> constructor
    {
        this.t_num=t_num;
        this.t_name=t_name;
        this.source=source;
        this.des=des;
        this.t_seats=t_seats;
        this.av_seats=av_seats;
        this.t_price=t_price;
    }

    //methods
    public void bookSet()
    {
        av_seats--;
    }
    public void cancelSeat()
    {
        av_seats++;
    }
    public void displayTrainInfo()
    {
        System.out.println(t_num + "|" + t_name + "|" + source + "->" +  des +
                "|"+ "seats:+ |"+ av_seats + "| price :"+t_price);
    }


    public String gett_num()
        {
            return t_num;
        }
    public String gett_name()
    {
        return t_name;
    }
    public String getSource()
    {
        return source;
    }
    public String getDes()
    {
        return des;
    }
    public int gett_seats()
    {
        return t_seats;
    }

    public int getav_seats()
    {
        return av_seats;
    }
    public double gett_price()
    {
        return t_price;
    }


}
