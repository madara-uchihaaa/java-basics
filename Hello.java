interface Computer{
    void compute();
}

class Laptop implements Computer{
    public void compute(){
        System.out.println("Laptop");
    }
}
class Desktop implements Computer{
    public void compute(){
        System.out.println("Desktop");
    }
}
class Hello {
    public static void main(String[] arguments) {
        System.out.println("Hello, world!");
        Computer c = new Laptop();
        c.compute();

        Computer d = new Desktop();
        d.compute();
    }
}
