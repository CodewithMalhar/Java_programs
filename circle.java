import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle :");
        double radius = sc.nextDouble();
        final double PI = 22/7.0;
        final double AREA = PI *(radius * radius);
        final double PERIMETER = 2*PI*radius;
        System.out.println("Radius :"+radius);
        System.out.printf("Area of Circle is :%.3f cm^2 %n",AREA);
        System.out.printf("Perimeter of Circel is :%.3f cm",PERIMETER);

        sc.close();
    }
}
