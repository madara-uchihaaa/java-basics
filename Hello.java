class A {
    public void print() {
        System.out.println("A");
    }
}
class Hello {
    public static void main(String[] arguments) {
        A a = new A() {
            public void print() {
                System.out.println("C");
            }
        };
        // Anonymous class is created and its object is assigned to a.
        // Its a bit tricky, but the above code is equivalent to:
        // class C extends A {
        //     public void print() {
        //         System.out.println("C");
        //     }
        // }
        A b = new A();
        a.print();
        b.print();
    }
}
