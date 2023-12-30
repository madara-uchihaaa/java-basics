import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Hello {
    public static void main(String[] arguments) {

        int i = 0;
        int j = 0;
        BufferedReader br = null;
        try {
            // int res = i / j;

            br = new BufferedReader(new InputStreamReader(System.in));

            Integer c = Integer.parseInt(br.readLine());
            System.out.println("You entered: " + c);
        } catch (Exception e) {
            System.out.println("Exception" + e.getMessage());
        } finally {
            System.out.println("Hello World!");
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
