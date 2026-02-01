public class simplecal
{
    public static void main(String args[])
    {
        int input= 4;
        int a=2;
        int b=4;
        String message = (input == 1) ? String.valueOf(a + b) :
            (input == 2) ? String.valueOf(a - b) :
            (input == 3) ? String.valueOf(a * b) :
            (input == 4) ? String.valueOf(a % b) :  
            "Invalid number";
        System.out.println(message);
    }
}