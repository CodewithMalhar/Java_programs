import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();

        String result = (num%2==0)? num+" is an Even Number" : num+" is an Odd number";
        System.out.println(result);

        sc.close();

    }
}
