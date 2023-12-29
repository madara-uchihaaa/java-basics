class Hello {

    public static void main(String[] arguments) {

        // Type casting

        // byte b = 127;
        // int a = 256;

        // b = a // error due to data loss
        // b = (byte) a // no error why ? Explicit type casting

        // a = b // no error why ?
        // Automatic type casting

        // float f = 5.6f;
        // int x = 5.6; // error
        // int x = (int) 5.6; // no error but data loss

        byte b = 127;
        System.out.println(b);

        int a = b;
        System.out.println(a);

        int x = 268;
        byte k = (byte) x; // Error due to data loss
        // k will be 12 as 268% 128 = 12
        System.out.println(k + " " + x);


        float f = 5.6f;
        int y = (int)f;

        System.out.println(y); // 5

        // Type promotion

        // byte -> short -> int -> long -> float -> double
        byte b1 = 10;
        byte b2 = 20;

        int result = b1 * b2; // b1 and b2 will be promoted to int

        System.out.println(result);
    }
}