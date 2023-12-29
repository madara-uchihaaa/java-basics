class Hello{

    public static void main(String[] arguments){

        // Primitive data types

        // 1 Integer -> int, [4 bytes] long [8 bytes], short [2 bytes], byte [1 byte], default int

        // 2 Float -> float [4 bytes], double [8 bytes] , default double for float use f or F

        // 3 Double -> double
        // 4 Boolean -> boolean [1 byte]
        // 5 Char -> char [2 bytes], it use Unicode character set 
        // 6 String -> String


        Integer i = 2;
        Integer j = 3;
        Float f = 2.3f;
        Double d = 2.3;
        Boolean b = true;
        Character c = 'a';
        String s = "Hello World!";
        Byte by = 1;

        System.out.println("World! let check");
        System.out.println(i+j);
        System.out.println(f+d);
        System.out.println(b);
        System.out.println(c);
        System.out.println(s);
        System.out.println(by);
    }
}