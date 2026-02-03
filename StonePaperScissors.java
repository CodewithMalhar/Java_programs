import java.util.Scanner;

public class StonePaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        infiniteloop :
        for ( ; ;)
        {
            System.out.println("****Welcome****\n");
            System.out.println("1.Stone \n2.Paper \n3.Scissor\n");
            System.out.println("Enter your Response :");
            int dgtUser = sc.nextInt();
            String user ="";

            if(dgtUser == 1) user = "Stone";
            else if(dgtUser == 2) user = "Paper";
            else if(dgtUser == 3) user = "Scissor";
            else 
            {
                System.out.println("Invalid Response");
                continue infiniteloop;
            }

            int dgtbot = 0;
            for(; ; )
            {
                dgtbot = (int)(Math.random()*10);
                if(dgtbot >=1 && dgtbot <= 3)
                    break;
            }

            String bot = "";
            if(dgtbot == 1) bot = "Stone";
            else if(dgtbot == 2)bot = "Paper";
            else bot = "Scissor";

            System.out.printf("%n%10s %8s","Bot","User");
            System.out.printf("%n%9s %7s","|","|");
            System.out.printf("%n%9s %7s","v","v");
            System.out.printf("%n%10s %8s",bot,user);

            //calulate winner
            if(bot.equals("Stone") && user.equals("Paper")||
            bot.equals("Paper") && user.equals("Scissor") ||
            bot.equals("Scissor") && user.equals("Stone"))
            {
                System.out.println("\n****User Won****\n");
            }
            else if(bot.equals("Stone") && user.equals("Scissor")||
            bot.equals("Paper") && user.equals("Stone") ||
            bot.equals("Scissor") && user.equals("Paper"))
            {
                System.out.println("\n****Bot Won****\n");
            }
            else
            {
                System.out.println("\n****It's a Draw****\n");
            }
        }
    }
}
