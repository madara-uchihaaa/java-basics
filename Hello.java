class ZeroException extends Exception {
    ZeroException(String s) {
        super(s);
    }
}

class Hello {
    public static void main(String[] arguments) {

        int x = 0;
        int nums[] = { 1, 2, 3, 4, 5 };
        String s = null;
        try {
            if (x == 0) {
                // throw new ArithmeticException("x is 0");
                throw new ZeroException("x is 0");
            }
            int j = 10 / x;

            System.out.println("Result after 0: " + j);
            System.out.println("Value at 5: " + nums[2]);
            System.out.println("String length: " + s.length());
        } catch (ArithmeticException e) {
            System.out.println("Error for ArithmeticException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error for ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (ZeroException e) {
            System.out.println("Error for ZeroException: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Error for NullPointerException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error for Exception: " + e.getMessage());
        }

        // You cant handle errors you can only catch them
    }
}
