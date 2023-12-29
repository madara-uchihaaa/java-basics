class Hello {
    public static void main(String[] arguments) {
        int[][] a = new int[3][]; // Jagged array

        a[0] = new int[3];
        a[1] = new int[2];
        a[2] = new int[1];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length ; j++) {
                a[i][j] = i + j;
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        int[][] b = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; // Rectangular array

        for (int[] row : b) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        int[][][] c = new int[3][2][]; // 3D array

        c[0][0] = new int[3];
        c[0][1] = new int[2];
        c[1][0] = new int[3];

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length ; j++) {
                for (int k = 0; k < c[i][j].length; k++) {
                    c[i][j][k] = i + j + k;
                    System.out.print(c[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}