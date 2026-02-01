import java.util.Scanner;

public class check_for_all {
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Character :");
        char ch = sc.next().charAt(0);

        String result = (ch>='A' && ch<='Z')? ch+" is UpperCase" : (ch>='a' && ch<='z')? ch+" is Lowercase" : !(ch>=0 && ch<=9)? ch+" is a digit" : ch+" is a Special character";
        System.out.println(result);

        sc.close();
    }
}
