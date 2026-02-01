import java.util.Scanner;

public class alp_digi_not {
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Character :");
        char ch = sc.next().charAt(0);

        String result = (ch>='A' && ch<='Z' || ch>='a' && ch<='z')? ch+" is a Alphabet" : (ch>=0 && ch<=9)? ch+" is a digit" : ch+ " is not a digit";
        System.out.println(result);

        sc.close();
    }
}
