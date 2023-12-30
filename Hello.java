@FunctionalInterface
interface HelloInterface {
    public void sayHello();
    // Error: Interface abstract methods cannot have body (JDK 1.8)
}

@FunctionalInterface 
interface LaptopInterface{
    public void sayLaptop(String Name);
}

@FunctionalInterface
interface Command{
    public boolean execute(String  command);
}

class Hello {
    public static void main(String[] arguments) {

        // Anonymous class
        HelloInterface hello = new HelloInterface() {
            public void sayHello() {
                System.out.println("Hello World! 1");
            }
        };
        hello.sayHello();

        // Lambda expression
        HelloInterface hello2 = () -> System.out.println("Hello World! 2");
        hello2.sayHello();

        // Lambda expression with multiple statements
        HelloInterface hello3 = () -> {
            System.out.println("Hello World! 3");
            System.out.println("Hello World! 4");
        };
        hello3.sayHello();


        // Lambda expression with parameters
        HelloInterface hello4 = () -> {
            System.out.println("Hello World! 5");
            System.out.println("Hello World! 6");
        };
        hello4.sayHello();

        // Lambda expression with parameters
        LaptopInterface laptop = (name) -> {
            System.out.println("Hello " + name);
        };
        laptop.sayLaptop("Dell");

        // Lambda expression with parameters
        Command command = (cmd) -> {
            System.out.println("Executing " + cmd);
            return true;
        };
        command.execute("ls -l");
        System.out.println(command.execute("ls -l"));
    }
}
