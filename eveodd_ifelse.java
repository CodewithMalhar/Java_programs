import java.util.Scanner;

public class eveodd_ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :");
        int digi = sc.nextInt();

        if(digi%2==0)
        {
            System.out.println(digi+" is an Even number");
        }
        else
        {
            System.out.println("It is an Odd number");
        }

        sc.close();
    }
}
