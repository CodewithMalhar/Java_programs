import java.util.Scanner;

public class Meters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for feet :");
        double feet = sc.nextDouble();

        //double f_foot = feet * 0.3048; 
        double f_foot = feet * 0.305;
        System.out.println(feet+" feet is :"+f_foot+"meters");

        sc.close();
    }
}
