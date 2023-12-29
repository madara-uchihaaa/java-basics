class Hello {

    public static void main(String[] arguments) {
        // Literals
        // They are the values that are assigned to variables

        Integer age = 0b101; // 5
        System.out.println(age);

        Integer num = 10_10_10;
        System.out.println(num);

        double d = 1;
        // Double x , double x [correct]
        // Error -> d = 1.0;
        System.out.println(d);

        // Character
        char c = 'a';
        System.out.println(c);
        c++;
        // c = c + 1; [Error]
        System.out.println(c);
    }
}