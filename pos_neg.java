import java.util.Scanner;

public class pos_neg {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();

        String result = (num>0)? num+" is positive number" : (num<0)? num+" is Negative number" : "the number is Zero";
        System.out.println(result);

        sc.close();
    }
}
