class A {
    public int getValue() throws ArithmeticException {
        return 1;
    }

    public int getLength() throws NullPointerException {
        String s = null;
        return s.length();
    }
}

class Hello {
    public static void main(String[] arguments) {
        A a = new A();
        try {
            System.out.println(a.getValue());
            System.out.println(a.getLength());
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}
