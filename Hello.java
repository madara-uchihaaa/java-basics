sealed class A permits B, C {
    public void sayHello() {
        System.out.println("Hello");
    }
}
final class B extends A {}
final class C extends A {}

class Hello {
    public static void main(String[] arguments) {
   
    }
}
