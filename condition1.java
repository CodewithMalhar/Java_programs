public class condition1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        // int  result = a>b && a>c ? a: b>c ? b:c;
        // System.out.println("Largest number is: "+result);

        // int result1 = a<b && a<c ? a: b<c ? b:c;
        // System.out.println("Smallest number is: "+result1);

        int result= a > b ? ((a > c)? a:c) : ((b > c )?b:c);
        System.out.println("Largest number among 3 No. is: "+result);

        int result1 = a < b ? ((a < c)?a:c) : ((b < c)?b:c);
        System.out.println("Smallest number among 3 No. is: "+result1);
    }
}
