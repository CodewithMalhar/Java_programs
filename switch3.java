// Program to print table of given number using switch

import java.util.Scanner;

public class switch3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for table");
        int num = sc.nextInt();
        System.out.println("<----Table of "+num+"---->");
        int i =1;
        while(i <= 10)
        {
            System.out.println(num + " x "+i+" = "+num*i);
            i++;
        }

        sc.close();
    }
}
