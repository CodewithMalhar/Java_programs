import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    static String name;
    static String address;
    static Long contact ;
    static Long adhar ;
    static String pancard ;
    static double balance;
    static int pin;
    static ArrayList<String> transaction = new ArrayList<String>(); 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        welcomeLoop :
        for( ; ;)
        {
            System.out.println("\n       Welcome      ");
            System.out.println("**** LAXMI CHIT FUND ****");
            System.out.println("1.CREATE ACCOUNT \n2.LOGIN \n");
            System.out.println("Enter your Response :");
            int resp = sc.nextInt();
            switch(resp)
            {
                case 1 :{
                    if(name !=null)
                    {
                        System.out.println("\n ACCOUNT ALREADY EXSIST \n");
                        continue;
                    }
                    System.out.println("\n ACCOUNT CRESTION PAGE \n");
                    System.out.println("Name :");
                    name = new Scanner(System.in).nextLine();
                    System.out.println("Adress :");
                    address = new Scanner(System.in).nextLine();
                    System.out.println("Contact :");
                    contact = new Scanner(System.in).nextLong();
                    System.out.println("Adhar :");
                    adhar = new Scanner(System.in).nextLong();
                    System.out.println("pancard :");
                    pancard = new Scanner(System.in).next();
                    System.out.println("Enter a amount :");
                    balance = new Scanner(System.in).nextDouble();
                    transaction.add("DEPOSIT (CREATION) : "+balance);
                    System.out.println("Pin :");
                    pin = new Scanner(System.in).nextInt();
                    System.out.println("*** ACCOUNT CREATED SUCCESSFULLY ***");
                    break;
                }
                case 2 :{
                    if(name == null)
                    {
                        System.out.println("\n CREATE YOUR ACCOUNT FIRST \n");
                        continue;
                    }
                    System.out.println("\n LOGIN MODULE \n");
                    System.out.println("Contact : ");
                    Long userContact = new Scanner(System.in).nextLong();
                    System.out.println("PIN :");
                    long userPin = new Scanner(System.in).nextInt();

                    if(contact == userContact && pin == userPin)
                    {
                        System.out.println("\nLOGIN SCUCCESFULLY \n");

                        feature :
                        for ( ; ;)
                        {
                            System.out.println("\n **** Features ****");
                            System.out.println("1.DEPOSIT \n2.WITHDRAW \n3.CHECK BALANCE \n4.TRANSACTION \n5.LOGOUT");
                            System.out.println("\nEnter your option : ");
                            int otp = sc.nextInt();
                            switch(otp)
                            {
                                case 1:{
                                    System.out.println("\n DEPOSIT AMOUNT MODULE\n");
                                    System.out.println("Enter desposit amount : ");
                                    double deptAmt = new Scanner(System.in).nextDouble();
                                    balance += deptAmt;
                                    transaction.add("DEPOSIT :"+deptAmt);
                                    System.out.println("\n AMOUNT DESPOSIT SCUCCESFULLY \n");
                                    break ;
                                }
                                case 2:{
                                    System.out.println("\n WITHDRAW AMOUNT MODULE ");
                                    System.out.println("Enter an amount : ");
                                    double wdrwAmt = new Scanner(System.in).nextDouble();
                                    System.out.println("Enter your pin :");
                                    int pin2 = new Scanner(System.in).nextInt();
                                    if(pin2 == pin)
                                    {
                                        if (wdrwAmt<=balance) {
                                            balance -= wdrwAmt;
                                            transaction.add("WITHDRAW : "+wdrwAmt);
                                            System.out.println("\n AMOUNT DEBITED SCUCESSFULLY \n");
                                        }
                                        else
                                        {
                                            System.out.println("\n INSUFFICIENT FUNDS");
                                        }
                                    }
                                    else
                                    {
                                        System.out.println("\n INAVALID PIN\n");
                                    }
                                    break;
                                }
                                case 3:{
                                    System.out.println("\n CHECK BALANCE MODULE \n");
                                    System.out.println("Enter your pin : ");
                                    int pin2 = new Scanner(System.in).nextInt();
                                    if(pin2 == pin ){
                                        System.out.println("Your account balance is : "+balance+"rs.");
                                    }
                                    else{
                                        System.out.println("\n INVALID PIN\n");
                                    }
                                    break;
                                }
                                case 4:{
                                    System.out.println("\n **** TRANSACTION MODULE *** \n");
                                    for (String ele : transaction)
                                    {
                                        System.out.println(ele);
                                    }
                                    System.out.println();
                                    break;
                                }
                                case 5:
                                    {
                                        System.out.println("\n THANK YOU VIST AGAIN \n");
                                        continue welcomeLoop;
                                    }
                                default:{
                                    System.out.println("\n INVALID RESPONSE");
                                }
                            }
  
                        }
                    }
                    else
                    {
                        System.out.println("\n INVALID CREDINTIAL \n");
                    } 
                    break;
                }
                default:
                    {
                        System.out.println("\n INVA");
                    }
            }
        }
    }
}

