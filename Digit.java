import java.util.Scanner;
public class Digit {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Digit :");
        char ch = sc.next().charAt(0);

        String result = ch>='0' && ch<='9' ? ch+":is Digit" : ch+":is not a Digit";
        System.out.println(result);

        sc.close();
    }
}
