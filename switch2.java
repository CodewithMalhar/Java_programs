// Program for printing (a-z) and (A-Z) using swtich

public class switch2 {
    public static void main(String[] args) {
        // char ch = 'a';

        // while(ch <'z')
        // {
        //     System.err.println(ch+"\t");
        //     ch++;
        // }

        // System.out.println("\n");

        // char ch1 = 'A';

        // while (ch1 < 'Z') {
        //     System.out.println(ch1+"\t");
        //     ch1++;
        // }

        char upper = 'A';
        char lower = 'a';
        System.out.println("UPPERCASE"+"  "+"LOWERCASE");
        while ( upper <= 'Z')
        {
            while (lower <= 'z') {
                
                System.out.println(" "+upper+"             "+lower);
                upper++;
                lower++;
            }
        }
    }
}
