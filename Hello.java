// Annotations;

@Deprecated // Annotation used to indicate that a method is deprecated
class A{
    public void print(){
        System.out.println("A");
    }
}

class B extends A{
    @Override // Annotation used to override a method
    public void print(){
        System.out.println("B");
    }
}

class Hello {
    public static void main(String[] arguments) {
        A a = new A();
        B b = new B();
        A c = new B();
        a.print();
        b.print();
        c.print();
    }
}
