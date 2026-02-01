import java.util.Scanner;
public class Scanner1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Full Name :");
        String name = sc.nextLine();

        System.out.println("Enter you Age :");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter your collage name :");
        String collage_name = sc.nextLine();
        
        System.out.println("Enter Your Roll no: ");
        int roll = sc.nextInt();

        System.out.println("Enter your CGPA :");
        float cgpa = sc.nextFloat();
        
        System.out.println("------Studnet Detials------");
        System.out.println("\nStudnent Name :"+name);

        System.out.println("\nStudnet Age :"+age);

        System.out.println("\nStudent Collage name :"+collage_name);

        System.out.println("\nStudnet Roll no :"+roll);

        System.out.println("\nStudent CGPA :"+cgpa);

        sc.close(); 

        

    }
}
