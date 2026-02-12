//Program to check weather the given number has zero or not

import java.util.Scanner;

public class NumPriniting4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number :");
        int num = sc.nextInt();

        boolean hasZero = false;
        while(num > 0)
        {
            int digit = num % 10;

            if(digit == 0)
            {
                hasZero = true;
                break;
            }
            num /= 10;
        }
        if(hasZero)
        {
            System.out.println("The number contians the Zero");
        }
        else
        {
            System.out.println("The number dosent contain the zero");
        }
    }
}
