//Program to extract every digit and print it, given by user

import java.util.Scanner;

public class NumPrinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number :");
        int num = sc.nextInt();

        while(num > 0)
        {
            int result = num % 10;
            System.out.println(result);
            num /= 10;
        }
    }
}
