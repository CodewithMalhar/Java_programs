import java.util.Scanner;

public class alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character :");
        char ch = sc.next().charAt(0);

        String result = (ch>='A' && ch<='Z' || ch>='a' && ch<='z') ? ch+"It is an Alphabet" :ch+ "It is not an Alphabet";
        System.out.println(result);

        sc.close();
    }
}
