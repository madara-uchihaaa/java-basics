// Interface -> Abstract Class -> Concrete Class -> Object (Instance) 
interface Computer {
    // By default, all methods in an interface are public and abstract
    void compute();

    void config();

    int age = 100; // By default, all variables in an interface are public, static, and final
}

interface Device{
    void details();
}

// class -> interface -> implements
// class -> class -> extends
// interface -> interface -> extends
// class -> interface -> implements -> implements

class Laptop implements Computer , Device{
    public void compute() {
        System.out.println("Laptop");
    }

    public void config() {
        System.out.println("Laptop Config");
    }
    public void details(){
        System.out.println("Laptop Details");
    }   
}

class Desktop implements Computer , Device{
    public void compute() {
        System.out.println("Desktop");
    }

    public void config() {
        System.out.println("Desktop Config");
    }
    public void details(){
        System.out.println("Desktop Details");
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
