class Human {
    private int age; // private variable -> can't be accessed outside the class
    String name;

    void setAge(int age) {
        this.age = age;
        // this -> refers to the current object of the class
        // age -> refers to the parameter
        // age = age will give error because both are same and it will refer to the parameter
    }

    int getAge() {
        return this.age;
    }
    // Naming convention for getters and setters, its not compulsory but its a good practice

    // RightClick -> Source -> Generate Getters and Setters 
}

class Hello {
    public static void main(String[] arguments) {
        Human h = new Human();
        h.name = "John";
        // h.age = 24; // error -> age is private

        h.setAge(24); // correct
        System.out.println(h.getAge()); // correct
    }
}