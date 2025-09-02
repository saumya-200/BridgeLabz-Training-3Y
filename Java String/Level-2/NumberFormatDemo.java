import java.util.Scanner;

public class NumberFormatDemo {

    // Method to generate exception
    public static void generateException(String text) {
        int num = Integer.parseInt(text); // throws exception if not a number
        System.out.println("Number: " + num);
    }

    // Method to handle exception
    public static void handleException(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println("Number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value: ");
        String text = sc.next();

        // generateException(text);
        handleException(text);
    }
}
