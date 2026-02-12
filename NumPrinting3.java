import java.util.Scanner;

public class NumPrinting3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int even = 0;
        int odd = 0;

        System.out.println("Enter the number :");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("It is an even number ");
        }
        else
        {
            System.out.println("Its an odd number ");
        }

        int temp = num;

        while(temp > 0)
        {
            int digit = temp % 10;
            if(temp % 2 == 0)
            {
                even++;
            }
            else
            {
                odd++;
            }
            temp /= 10;
        }
    System.out.println("Count of even numbers :"+even);
    System.out.println("Count of odd numbers :"+odd);
    }
}
