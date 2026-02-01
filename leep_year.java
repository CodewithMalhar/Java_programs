import java.util.Scanner;
public class leep_year {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year :");
        int year = sc.nextInt();

        String result = ((year%4==0) || (year%400==0))? year+" is a Leap year" : year+ " is not a leap year";
        System.out.println(result);

        sc.close();
    }
}
