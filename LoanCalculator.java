import java.util.Scanner;

public class LoanCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for( ; ;)
        {
            System.out.println("\n    **** WELCOME ****  \n");
            System.out.print("Amount :");
            double amount = sc.nextDouble();
            if(amount<1000 || amount >1000000)
            {
                System.out.println("\n INVALID AMOUNT ");
                continue;
            }
            System.out.println("Rate of Interest (P.M) : ");
            double interest = sc.nextDouble();
            if(interest<1 || interest > 30)
            {
                System.out.println("\n INVALID INTREST \n");
                continue;
            }
            System.out.println("Loan tenure (months) : ");
            int tenure = sc.nextInt();
            if(tenure<3 || tenure >36)
            {
                System.out.println("\n INVALID TENURE ");
                continue;
            }
            double perMonthInt = (amount / 100)*interest;
            double totalInterestAmount = perMonthInt * tenure ;
            double emi = (amount + totalInterestAmount);
            double totalAmount = amount + totalInterestAmount;

            System.out.println("Monthly emi      : "+emi);
            System.out.println("Principle amount : "+amount);
            System.out.println("Total Interest   : "+totalInterestAmount);
            System.out.println("Total Amount     : "+totalAmount);
        }
    }
}
