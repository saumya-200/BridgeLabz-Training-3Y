import java.util.Scanner;

public class IllegalArgumentDemo {

    // Method to generate exception
    public static void generateException(String text) {
        System.out.println(text.substring(5, 2)); // invalid: start > end
    }

    // Method to handle exception
    public static void handleException(String text) {
        try {
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();

        // generateException(text);
        handleException(text);
    }
}
