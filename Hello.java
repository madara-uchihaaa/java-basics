import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Hello {
    public static void main(String[] arguments) {

        // Method 1

        System.out.println("Enter your name: ");
        String name = System.console().readLine();

        System.out.println("Hello, " + name + "!");

        System.out.println("Enter your age: ");
        int age = Integer.parseInt(System.console().readLine());
        System.out.println("You are " + age + " years old.");

        // Method 2

        System.out.print("Enter your name: ");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        try {
            name = br.readLine();
        } catch (Exception e) {
            System.out.println("Error!");
        }
        try {
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Method 3

        System.out.print("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        Integer num = sc.nextInt();
        System.out.println("You entered " + num);

        sc.close();
    }
}
