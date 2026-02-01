public class simplebankop
{
    public static void main(String args[])
    {
        int input= 1;
        int amount= 200;
        int pin_number= 9890;

        int balance = 5000;


        int result= (input==1)?amount=amount+balance:(input==2)?((amount<=balance)?balance-=amount:-1):(input==3)?balance:0;
        System.out.println("Current balance:"+result);
    }
}