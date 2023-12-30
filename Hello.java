

class Hello {
    public static void main(String[] arguments) {
        AdvanceCalculator advanceCalculator = new AdvanceCalculator();

        System.out.println("Power of 2^3 is " + advanceCalculator.power(2, 3));
        advanceCalculator.power(0, 0);

        // To access Calculator class, we need to create an object of Calculator class
        // or extend Calculator class

        advanceCalculator.add(4, 0);

        // In java multiple inheritance is not allowed
    }
}