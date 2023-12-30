class A{
    public int a;
    public void display(){
        System.out.println("A");
    }
    public void show(){
        System.out.println("A");
    }
}
class B extends A{
    public int b;
    public void display(){
        System.out.println("B");
    }
    public void show(String s){
        System.out.println(s);
    }
}

class Hello {
    public static void main(String[] arguments) {
        B obj = new B();
        obj.display();
        obj.show();
        // Since show() is in A only and not in B, it will call the show() of A
        // But if we pass a string in show() of B, it will call the show() of B
        obj.show("B class");

        // B is a child class of A and methods of A are overridden in B
    }
}