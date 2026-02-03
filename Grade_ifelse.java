import java.util.Scanner;

public class Grade_ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your marks :");
        double marks = sc.nextDouble();
        final double TOTAL_MARKS = 500;

        if(marks<0 || marks>500)
        {
            System.out.println("Invalid Marks Entered");
            return;
        }
        double per = (marks / TOTAL_MARKS)*100;
        String grade ="" , remark = "";
        if(per>=90)
        {
            grade= "O";
            remark = "OUTSTANDING";
        }
        else if(per>=75)
        {
            grade = "A+";
            remark = "FIRST CLASS WITH DISTINCTION";
        }
        else if(per>=60)
        {
            grade = "A";
            remark = "FIRST CLASS";
        }
        else if(per>=50)
        {
            grade = "B";
            remark = "SECOND CLASS";
        }
        else if(per>=30) 
        {
            grade = "C";
            remark = "PASS";
        }
        else
        {
            grade = "F";
            remark = "FAIL";
        }

    System.out.println("Grade :"+grade);
    System.out.println("Remark :"+remark);
    System.out.println("Marks :"+marks+"/"+TOTAL_MARKS);
    System.out.println("Percentage :"+per+"%");
    }
}
