class Human {
    private int age; // private variable -> can't be accessed outside the class
    String name;

    Human(int age, String name) { // Parameterized Constructor
        this.age = age;
        this.name = name;
    }
    Human() { // Default Constructor
        this.age = 10;
        this.name = "Ram JI";
    }
    // By default, if we don't create any constructor, java will create a default

    // RightClick -> Source -> Generate Constructor using Fields
    // RightClick -> Source -> Generate Constructor w/o Fields

    void setAge(int age) {
        this.age = age;
        // this -> refers to the current object of the class
        // age -> refers to the parameter
        // age = age will give error because both are same and it will refer to the
        // parameter
    }

    int getAge() {
        return this.age;
    }
    // Naming convention for getters and setters, its not compulsory but its a good
    // practice

    // RightClick -> Source -> Generate Getters and Setters
}

class Hello {
    public static void main(String[] arguments) {
        Human h = new Human(20, "John");
        h.name = "Raj";
        // h.age = 24; // error -> age is private

        h.setAge(24); // correct
        System.out.println(h.getAge()); // correct
    }
}