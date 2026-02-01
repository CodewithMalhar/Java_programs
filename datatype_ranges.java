
public class datatype_ranges {
    public static void main(String[] args) {
        int i = 256;
        byte b1 = (byte)i;
        System.out.println(b1);

        int i2 = 65536;
        short s2 = (short)i2;
        System.out.println(s2);

        long i3 = 4294967296l;
        int l1= (int)i3;
        System.out.println(l1);

        // long x = Long.MIN_VALUE;
        // System.out.println("Min value : "+x); //-9223372036854775808

        // long x1 = Long.MAX_VALUE;
        // System.out.println("Maxium value : "+x1); //9223372036854775807

        long x2 = -9223372036854775808l;
        double result = x2 * 2;
        System.out.println("value is: "+result);
        long l3 = (long)result;
        System.out.println("After storing in Long: "+l3);

        double d1 = Double.MIN_VALUE; //4.9E-324
        // double d2 = Double.MAX_VALUE; //1.7976931348623157E308
        double result1 = d1 /2;
        System.out.println(result1);


    }
}
