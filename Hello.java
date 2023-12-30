class Hello {
    public static void main(String[] arguments) {
        // Wrapper class for primitive type

        // Integer
        Integer i = new Integer(10);

        // Double
        Double d = new Double(10.5);

        // Character
        Character c = new Character('a');

        // Boolean
        Boolean b = new Boolean(true);

        // Byte
        Byte by = new Byte((byte) 10);

        // Short
        Short s = new Short((short) 10);

        // Long
        Long l = new Long(10);

        System.out.println(i);
        System.out.println(d);
        System.out.println(c);
        System.out.println(b);
        System.out.println(by);
        System.out.println(s);
        System.out.println(l);

        Integer x = 10; // No need to use new keyword

        int num = 7;
        Integer y = num; // Autoboxing -> Integer y = new Integer(num);

        int z = y; // auto-Unboxing -> int z = y.intValue();

        // Autoboxing -> Defined as a primitive type but used as a wrapper class
        // Auto-Unboxing -> Defined as a wrapper class but used as a primitive type

        String str = "10";
        int a = Integer.parseInt(str); // String to int
        System.out.println(a);

    }
}
