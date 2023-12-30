// To prevent getting extended use final
// final class A{ // A cannot be get extended
// Method can also be final
class A{ // A can be get extended
    public void print(){
        System.out.println("A");
    }
    public int add(int a, int b){
        return a + b;
    }
}

class B extends A{
    public void print(){
        System.out.println("B");
    }
    public int add(int a, int b){
        return a + b + 1;
    }
}

class Hello {
    public static void main(String[] arguments) {
        int x = 3; // x is a variable of type int will work;
        // final int x = 3; // x is a variable of type int will not work;
        final int y = 2; // y is a variable of type int will not work;
        // y = y * 2; // ? 
        x = x * 17;
        System.out.println("x is " + x);

        A a = new A();
        a.print();
        System.out.println(a.add(1, 2));
    }
}
