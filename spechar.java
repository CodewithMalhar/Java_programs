import java.util.Scanner;

public class spechar {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Character");
        char ch = sc.next().charAt(0);

        String result =!((ch>='A' && ch<='Z' || ch>='a' && ch<='z') || (ch>='0' && ch<='9'))? ch+" :is a Special Character" : ch+" :is not a special character";
        System.out.println(result);

        sc.close();
    }
}
