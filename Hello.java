class Hello {

    public static void main(String[] arguments) {
        // Logical Operators

        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;


        System.out.println("AND Operator");
        if (a > b && c > d) {
            System.out.println("a is greater than b AND c is greater than d");
        } else {
            System.out.println("a is NOT greater than b AND c is NOT greater than d");
        }

        System.out.println("OR Operator");

        if (a > b || c > d) {
            System.out.println("a is greater than b OR c is greater than d");
        } else {
            System.out.println("a is NOT greater than b OR c is NOT greater than d");
        }

        System.out.println("NOT Operator");

        if (!(a > b)) {
            System.out.println("a is NOT greater than b");
        } else {
            System.out.println("a is greater than b");
        }
    }

    // AND -> short circuit
    // true && true = true
    // true && false = false
    // false && true = false
    // false && false = false

    // OR -> short circuit
    // true || true = true
    // true || false = true
    // false || true = true
    // false || false = false

    // NOT
    // !true = false
    // !false = true
}