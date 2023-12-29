class Hello {

    public static void main(String[] arguments) {
        do {
            System.out.println("Hello World!");
        } while (false);
        // Do while vs while
        // do while will always execute at least once
        // while will only execute if the condition is true

        String[] days = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

        for (int i = 0; i < days.length; i++) {
            System.out.println("The day is " + days[i]);
            for (int hours = 1; hours <= 24; hours++) {
                System.out.println("The hour is " + hours + " of " + days[i]);
            }
        }
    }
}