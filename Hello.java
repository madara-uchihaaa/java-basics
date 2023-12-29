class Hello {
    public static void main(String[] arguments) {
        String name = new String("Rishabh");
        name = name + " Srivastava";
        System.out.println("Hello, " + name);

        //
        // String constant pool -> The place where all the string literals are stored
        // and its refernce are used by the stack;

        // Mutable -> String Buffer, String Builder
        // Immutable -> String

        StringBuffer sb = new StringBuffer("Rishabh");
        sb.append(" Srivastava");
        System.out.println(sb + " " + sb.length() + " " + sb.capacity());
        // capacity -> Its the size of the string buffer, it works as a dynamic array


        // String Builder -> It is same as string buffer but it is not thread safe
    }
}