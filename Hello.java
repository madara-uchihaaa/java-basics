class Hello {
    public static void main(String[] arguments) {
        int[] numbers = { 1, 2, 3, 4, 5 };
        System.out.println("numbers length is: " + numbers.length);
        for (int item : numbers) {
            System.out.println("Count is: " + item);
        }

        int[] num = new int[10];
        // By default, all the values are 0
        for (int i = 0; i < 10; i++) {
            num[i] = i;
        }

        num[0] = 10000;

        for (int item : num) {
            System.out.println("Count is: " + item);
        }

        // Index is 0 based
    }
}