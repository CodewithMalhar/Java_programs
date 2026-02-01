import java.util.Scanner;

public class upp_low_case {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Character :");
        char ch = sc.next().charAt(0);

        String Result = (ch>='A' && ch<='Z')? ch+" : is UpperCase" : ch+" : is Lowercase";
        System.out.println(Result);

        sc.close();
    }
}
