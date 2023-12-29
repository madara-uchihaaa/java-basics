class Math {
    public int Area(int length, int breadth) {
        return length * breadth;
    }

    public int Area(int side) {
        return side * side;
    }

    public int Area(int length, int breadth, int height) {
        return length * breadth * height;
    }

    public int AreaC(int radius) {
        return (int) 3.14 * radius * radius;
    }

    // These are the methods of the class Math
}

class Hello {
    public static void main(String[] arguments) {
        // JDK -> JRE -> JVM
        // JDK: Java Development Kit : Its a software development environment used for
        // developing Java applications and applets.
        // JRE: Java Runtime Environment : Its a set of software tools which are used
        // for developing Java applications.
        // JVM: Java Virtual Machine : Its an abstract machine. It is a specification
        // that provides runtime environment in which java bytecode can be executed.

        // Write in one line
        // Java is a platform independent, strongly typed, object oriented,
        // multi-threaded, distributed and robust language.

        // Function Implementation
        // access_specifier return_type function_name (arguments) {
        // // body
        // }


        Math m = new Math();
        System.out.println(m.Area(10, 20));
        System.out.println(m.Area(10));
        System.out.println(m.Area(10, 20, 30));
        System.out.println(m.AreaC(10));
        
    }
}