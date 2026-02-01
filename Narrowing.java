class Narrowing {
    public static void main(String args[]) {

        byte b = 10;
        System.out.println("byte value: " + b);

        short s = b;
        System.out.println("byte -> short: " + s);

        int i = b;
        System.out.println("byte -> int: " + i);

        long l = b;
        System.out.println("byte -> long: " + l);

        float f = b;
        System.out.println("byte -> float: " + f);

        double d = b;
        System.out.println("byte -> double: " + d);

        // char c= b;
        // System.out.println(c);
//----------------------------------------------------------------------------------------
        short s2 = 100;
        System.out.println("\nshort value: " + s2);

        int i2 = s2;
        System.out.println("short -> int: " + i2);

        long l2 = s2;
        System.out.println("short -> long: " + l2);

        float f2 = s2;
        System.out.println("short -> float: " + f2);

        double d2 = s2;
        System.out.println("short -> double: " + d2);

        char c = 'A';
        System.out.println("\nchar value: " + c);

        int i3 = c;
        System.out.println("char -> int: " + i3);

        float f3 = c;
        System.out.println("char -> float: " + f3);

        double d3 = c;
        System.out.println("char -> double: " + d3);
        

        float f4 = 10.5f;
        System.out.println("\nfloat value: " + f4);

        double d4 = f4;
        System.out.println("float -> double: " + d4);
    }
}
