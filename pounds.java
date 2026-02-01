import java.util.Scanner;

public class pounds {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);

        final double  pound_to_kg= 0.454;
        System.out.println("Enter the number in pounds :");
        double pounds = sc.nextDouble();

        double kilogram = pounds * pound_to_kg;
        System.out.println(pounds +" pound is "+kilogram+" Kilograms ");
    }
}
