class A {
    public void print() {
        System.out.println("A");
    }
}

class B extends A {
    public void print1() {
        System.out.println("B");
    }
}

class Hello {
    public static void main(String[] arguments) {
        // Upcasting and downcasting
        A a = (A) new B(); // Upcasting
        a.print();

        B b = (B) a; // Downcasting
        b.print1();
    }
}
