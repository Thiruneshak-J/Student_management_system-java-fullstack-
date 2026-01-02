public class passenger
{
    private String p_name;
    private int p_age;
    private String gen;
    private String phone;

    public passenger(String p_name,int p_age,String gen,String phone) //constructor
    {
        this.p_name=p_name;
        this.p_age=p_age;
        this.gen=gen;
        this.phone=phone;
    }
    public void pass_info()
    {
        System.out.println("NAME :"+p_name + "\n" +
                "AGE :"+p_age + "\n" +
                "GENDER :"+gen+ "\n" +
                "PHONE :"+phone);
    }

}
