class A {
    int marks; // 1:
    // private int marks; // 2:
    protected int age; // 3:
}
class B extends A {
    void display() {
        System.out.println(age); // 3: Will work
        System.out.println(marks); // 1: Will work
        // System.out.println(marks); // 2: Will not work due to private
    }
}
class D extends B {
    void display() {
        System.out.println(age); // 3: Will work
        System.out.println(marks); // 1: Will work
        // System.out.println(marks); // 2: Will not work due to private
    }
}
class Hello {
    public static void main(String[] arguments) {
        A a = new A();
        a.marks = 100; // 1: Will work
        a.marks = 100; // 2: Will not work due to private

    }
}

// 1: Public means the variable/method is accessible from anywhere
// 2: Private means the variable/method is accessible only within the class
// 3: Protected means the variable/method is accessible within the class and its subclasses


//                          Private   Public      Protected  Default

// Same Class               Y         Y           Y          Y

// Same package subclass    N         Y           Y          Y

// Same pkge nonSubclass    N         Y           Y          Y

// Diff package subclass    N         Y           Y          N

// Diff package nonSubclass N         Y           N          N
