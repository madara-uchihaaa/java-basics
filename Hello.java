class Hello {
    public static void main(String[] arguments) {
        int[][] a = new int[4][4];
        // Row is compulsory, column is optional

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                int random = (int) (Math.random() * 100);
                a[i][j] = random;
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "\t");
                // \t is tab
            }
            System.out.println();
        }
        System.out.println("Enhanced for loop");
        // Enhanced for loop
        for (int[] row : a) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }
}