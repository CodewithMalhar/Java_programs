import java.util.Scanner;

public class evm_ifelse {
        static int bjp , cong , mns , aap ,nota;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter population for the Area :");
        int population = sc.nextInt();

        for(int i=0; i<=population;i++ )
        {
            System.out.println("****Welcome****");
            System.out.println("APP KA EAK VOTE DESH BADAL SAKATA HAI :)");
            System.out.println("\n1.BJP\n 2.CONG\n 3.MNS\n 4.AAP\n 5.NOTA");
            System.out.println("\n");
            System.out.println("Enter your response :");
            String resp = sc.next().toUpperCase();

            if(resp.equals("BJP"))
            {
                bjp++;
                System.out.println("YOU HAVE VOTED FOR BJP");
                System.out.println("SUKHCHE DIVAS YENAR AHET.. HOPE SO");
            }
            else if(resp.equals("CONG"))
            {
                cong++;
                System.out.println("YOU HAVE VOTED FOR CONGRESS");
                System.out.println("JAY JAVAN JAY KISAN");
            }
            else if(resp.equals("AAP"))
            {
                aap++;
                System.out.println("YOU HAVE VOTED FOR AAP");
                System.out.println("CHALEGI JHADU UDHEGI DHOOL, NA REHEGA PANJA NA REHEGA PHOOL");
            }
            else if(resp.equals("MNS"))
            {
                System.out.println("YOU HAVE VOTED FOR MNS");
                System.out.println("FAKAT MARATHI");
            }
            else if(resp.equals("NOTA"))
            {
                System.out.println("YOU HAVE VOTE FOR MNS");
                System.out.println("YOU ARE AN EDUCATED PERSON");            
            }
            else 
            {
                System.out.println("Invalid Response ");
                i--;
            }
        }
        System.out.println("bjp :"+bjp);
        System.out.println("cong :"+cong);
        System.out.println("mns :"+mns);
        System.out.println("aap :"+aap);
        System.out.println("nota :"+nota);
    }
}