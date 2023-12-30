enum Color {
    RED, GREEN, BLUE;
}
class Hello {
    public static void main(String[] arguments) {
        System.out.println("Hello, World!");
        System.out.println(Color.RED);
        System.out.println(Color.GREEN);
        System.out.println(Color.BLUE);

        Color c = Color.RED;
        Color res = switch (c) {
            case RED -> Color.GREEN;
            case GREEN -> Color.BLUE;
            case BLUE -> Color.RED;
        };
        System.out.println(res);
        System.out.println(Color.RED.ordinal());

        Color[] colors = Color.values();
        for (Color color : colors) {
            System.out.println(color);
        }
    }   
}
