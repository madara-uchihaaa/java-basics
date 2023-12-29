class A {
    // By default every class get extends Object class
    A() {
        // super(); by default
        System.out.println("in A");
    }

    A(int i) {
        // super(); by default
        System.out.println("in A int");
    }
}

class B extends A {
    B() {
        // super(); by default
        // this(); calls the constructor of same class
        System.out.println("in B");
    }

    B(int i) {
        // super(); by default
        super(i);
        System.out.println("in B int");
    }
}

class Hello {
    public static void main(String[] arguments) {
        B b = new B(9);
        // A constructor is called first, then B constructor is called
        // case 1 when B, A -> In A and B;
        // case 2 when B(int) + B and A -> In A and B int
        // case 3 when B(int) + B and A and A(int) -> In A and B int
        // Every construtor have super 
        // To also have In A int pass int in super
    }
}
// Java follow naming convention of camelCase

// class , Interface -> CamelCase
// variables and methods -> small
// constants -> Capital