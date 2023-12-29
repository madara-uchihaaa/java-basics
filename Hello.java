class Hello {
    public static void main(String[] arguments) {
        // Strings in java;

        // Method 1
        String greeting = "Hello 1";
        System.out.println(greeting);

        // Method 2
        String greeting2 = new String("Hello 2");
        System.out.println(greeting2);

        // Method 3
        String greeting3 = new String();
        System.out.println(greeting3);
        // Result: <empty string>

        // Method 4
        String greeting4 = new String(new char[] { 'H', 'e', 'l', 'l', 'o', ' ', '4' });
        System.out.println(greeting4);

        // Method 5
        String greeting5 = new String(new byte[] { 72, 101, 108, 108, 111, 32, 53 });
        System.out.println(greeting5);

        // Method 6
        System.out.println(greeting + "->" + greeting2);
        // Result: Hello 1->Hello 2

        System.out.println(greeting.charAt(0));
        // Result: H

        System.out.println(greeting.length());
        // Result: 6

        System.out.println(greeting.substring(0, 3));
        // Result: Hel

        System.out.println(greeting.indexOf("l"));
        // Result: 2

        System.out.println(greeting.concat(greeting5));
        // Result: Hello 1Hello 5

    }
}