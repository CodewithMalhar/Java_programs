//Program to check even numbers form given number by

import java.util.Scanner;

public class NumPrinting2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Eenter the number :");
        int num = sc.nextInt();


        while (num > 0) {
            int result = num % 10;
            if(result % 2 == 0)
            {
                System.out.println(result);
            }
            num/=10;
        }

    }
}
