class A {
    public void show() {
        System.out.println("in A");
    }
}

class B extends A {
    public void show() {
        System.out.println("in B");
    }
}

class Hello {
    public static void main(String[] arguments) {
        // Polymorphism in java

        // 1. Method overloading -> Compile time polymorphism
        // 2. Method overriding -> Run time polymorphism

        // Example of method overloading
        // 1. Number of parameters
        // 2. Data type of parameters
        // 3. Sequence of parameters

        // Example of method overriding
        // 1. Inheritance
        // 2. Same method name
        // 3. Same parameters
        // 4. Same return type
        // 5. Different body

        A obj = new A();
        obj.show();
        // show not depends 

        obj = new B();
        obj.show();

    }
}
