public class prct1
{
    public static void main(String args[])
    {
        int a=10;
        int b=20;
        int c=30;
        int d=40;
        int e=50;

        



        int res2= a>b && a>c && a>d && a>e ?a: b>c && b>d && b>e ?b: c>d && c>e?c: d>e?d:e;
        System.out.println("Largest Number among 5 is :"+res2);
        
        int res3= a<b && a<c && a<d && a<e ?a: b<c && b<d && b<e ?b: c<d && c<e?c: d<e?d:e;
        System.out.println("Smallest Number among 5 is :"+res3);
    }
}