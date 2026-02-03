import java.util.Scanner;

public class CurrrencyConvertor {
    public static void main(String[] args) {
        for( ; ;)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("\n      Welcome     ");
            System.out.println("*******Currency Convertor*******");
            System.out.println("Enter an amount (INR) :");
            double amount = sc.nextLong();

            System.out.println("\n1.USD \n2.EUR \n3.KWD \n4.GBP \n5.JPY \n6.AUD \n7.CAD \n8.CHF \n9.CNY \n10.AED");
            System.out.println("Enter your response :");
            String resp = sc.next().toUpperCase();

            boolean assump = true;
            double convertedAmount =0;
            
            if(resp.equals("USD"))
            {
                convertedAmount = amount / 90.21;
            }
            else if(resp.equals("EUR"))
            {
                convertedAmount = amount / 106.53;
            }
            else if (resp.equals("KWD"))
            {
                convertedAmount = amount / 293.61;
            }
            else if (resp.equals("GBP"))
            {
                convertedAmount = amount / 104.0;
            }
            else if (resp.equals("JPY"))
            {
                convertedAmount = amount / 0.58;
            }
            else if (resp.equals("AUD"))
            {
                convertedAmount = amount / 55.0;
            }
            else if (resp.equals("CAD"))
            {
                convertedAmount = amount / 61.0;
            }
            else if (resp.equals("CHF"))
            {
                convertedAmount = amount / 92.0;
            }
            else if (resp.equals("CNY"))
            {
                convertedAmount = amount / 11.5;
            }
            else if (resp.equals("ADE"))
            {
                convertedAmount = amount / 22.6;
            }
            else 
            {
                assump = false;
                System.out.println("Invalid Currecy");
            }
            if(assump)
                System.out.printf("%n%20.2f INR = %.2f %s%n",amount,convertedAmount,resp);
        }
    }
}
