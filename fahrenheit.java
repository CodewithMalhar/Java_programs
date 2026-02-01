import java.util.Scanner;
public class fahrenheit {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in); 

        System.out.println("Enter a degree in Celsius :");
        double c_degree = sc.nextDouble();

        double fahrenheit1 = (9.0/ 5.0) * c_degree + 32;
        
        System.out.println(c_degree+" Celsius is "+fahrenheit1+" Faharenheit");

        sc.close();
    }
}
