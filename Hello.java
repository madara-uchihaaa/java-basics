class Hello {

    public static void main(String[] arguments) {
        // Operators

        int a = 10;
        int b = 20;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println((double) a / b);
        System.out.println(a % b);

        // Increment and Decrement

        // a = a + 1; or a += 1; or a++; all are same
        // a = a - 1; or a -= 1; or a--; all are same
        // a++ and ++a both are same but a++ is post increment and ++a is pre increment

        // Pre increment VS Post increment
        // Pre increment: First increment the value and then use it
        // Post increment: First use the value and then increment it
        
        // Example of Pre increment
        int c = 10;
        int d = ++c;
        System.out.println(c);
        System.out.println(d);

        // Example of Post increment
        int e = 10;
        int f = e++;
        System.out.println(e);
        System.out.println(f);


        // Comparison Operators

        int g = 10;
        int h = 20;
        System.out.println(g == h);
        System.out.println(g != h);
        System.out.println(g > h);
        System.out.println(g < h);
        System.out.println(g >= h);
        System.out.println(g <= h);
    }
}