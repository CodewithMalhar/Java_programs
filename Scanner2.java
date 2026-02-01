import java.util.Scanner;
public class Scanner2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("ENter str1 :");
        String st = sc.next();
        System.out.println("Str1 is :"+st);

        sc.next(); // fetch the word but didnt store it. 
        //mostly used to clear the buffer.

        System.out.println("Enter Str2 :");
        String st2 = sc.next();
        System.out.println("Str2 is :"+st2);

        System.out.println(st+" "+st2);
        sc.close();
    }
}
