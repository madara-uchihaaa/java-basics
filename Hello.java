class Hello {

    public static void main(String[] arguments) {
        // Conditional statement

        int a = 10;
        int b = 20;
        System.out.println("If-else statement");
        if (a == b) {
            System.out.println("a is equal to b");
        } else if (a > b) {
            System.out.println("a is greater than b");
        } else {
            System.out.println("b is greater than a");
        }

        // Switch statement
        System.out.println("Switch statement");
        switch (a) {
            case 10:
                System.out.println("a is 10");
                break;
            default:
                System.out.println("a is not 10");
                break;
        }

        // While loop
        System.out.println("While loop");
        int i = 0;
        while (i < 10) {
            System.out.println(i + " is less than 10");
            i++;
        }

        // Do-while loop
        System.out.println("Do-while loop");
        int j = 0;
        do {
            System.out.println(j + " is less than 10");
            j++;
        } while (j < 10);

        // For loop
        System.out.println("For loop");
        for (int y = 0; y < 10; y++) {
            System.out.println(y + " is less than 10");
        }

        // For-each loop
        System.out.println("For-each loop");
        int[] numbers = { 1, 2, 3, 4, 5 };
        for (int number : numbers) {
            System.out.println(number);
        }

        // Break statement
        System.out.println("Break statement");
        for (int k = 0; k < 10; k++) {
            if (k == 5) {
                break;
            }
            System.out.println(k + " is less than 10");
        }

        // Continue statement
        System.out.println("Continue statement");
        for (int l = 0; l < 10; l++) {
            if (l == 5) {
                continue;
            }
            System.out.println(l + " is less than 10");
        }
    }
}