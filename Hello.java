abstract class A {
    public abstract void print();
    public abstract void print2();
}

// class B extends A {
//     public void print() {
//         System.out.println("Hello");
//     }
// }

class Hello {
    public static void main(String[] arguments) {
        // B b = new B();
        // Anonymous class with abstract class
        A b = new A() {
            public void print() {
                System.out.println("Hello");
            }
            public void print2() {
                System.out.println("Hello2");
            }
        };
        b.print();
        b.print2(); 
    }
}
