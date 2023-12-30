abstract class Car { // Abstract class
    String name;
    String color;
    int price;

    Car(String name, String color, int price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
    }

    public abstract void setMatSpeed(); // This will be implemented by the child class

    public abstract void isFlying(); // This will be implemented by the child class

    class Engine {
        int enginePower;

        Engine(int enginePower) {
            this.enginePower = enginePower;
        }

        void display() {
            System.out.println("Engine Power: " + enginePower);
        }
    }
}

class BMW extends Car { // Concrete class
    int maxSpeed;

    BMW(String name, String color, int price, int maxSpeed) {
        super(name, color, price);
        this.maxSpeed = maxSpeed;
    }

    void display() {
        super.display();
        System.out.println("Max Speed: " + maxSpeed);
    }

    public void setMatSpeed() {
        maxSpeed = 300;
    }

    public void isFlying() {
        System.out.println("BMW is flying");
    }
    // Every abstract method in the parent class must be implemented in the child
}

class Hello {
    public static void main(String[] arguments) {

        // You cant create an object of an abstract class

        // Car car1 = new Car("BMW", "Black", 100000);
        // Car car2 = new Car("Audi", "White", 200000);
        // Car car3 = new Car("Mercedes", "Red", 300000);

        // System.out.println("Car 1");
        // car1.display();
        // System.out.println("Car 2");
        // car2.display();
        // System.out.println("Car 3");
        // car3.display();

        BMW bmw = new BMW("BMW", "Black", 100000, 200);
        bmw.display();
        bmw.setMatSpeed();

        Car.Engine engine = bmw.new Engine(1000);
        engine.display();
    }
}
