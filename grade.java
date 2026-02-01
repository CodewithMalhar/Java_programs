public class grade
{
    public static void main(String args[])
    {
        int smarks= 80;

        String res1 = smarks<=100 && smarks>=75 ? "A" :smarks>=60 && smarks<=74?"B":smarks>=50 && smarks<=59? "C": smarks>=35 && smarks<=49? "D": smarks>=0 && smarks<=34?"Fail":"Input Indvalid, Enter number between 0-100";
        System.out.println(res1);
        
    }
}