import java.util.Scanner;;

public class vol_cyclinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double PI = 3.14;
        System.out.println("Enter the radius and height of a cylinder :");
        double radius = sc.nextDouble();
        double height = sc.nextDouble();

        double area = PI * radius * radius ; /// take Math.PI for precise value of PI(get same output form the ppt) 
        double volume = area * height ;

        System.out.println("The area is :"+area);

        System.out.println("The voulme is :"+volume);
    }
}
