class Calculator{

    public int add(int a, int b){
        return a+b;
    }
    public int subtract(int a, int b){
        return a-b;
    }
    public int multiply(int a, int b){
        return a*b;
    }
    public int divide(int a, int b){
        return a/b;
    }
}

public class Hello {
    public static void main(String[] arguments) {
        System.out.println("Hello, world!");

        Calculator calc = new Calculator();
        System.out.println("1 + 2 = " + calc.add(1, 2));
        System.out.println("1 - 2 = " + calc.subtract(1, 2));
        System.out.println("1 * 2 = " + calc.multiply(1, 2));
        System.out.println("1 / 2 = " + calc.divide(1, 2));
    }
}