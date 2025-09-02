import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {

    // Method to generate exception
    public static void generateException(String[] arr) {
        System.out.println(arr[arr.length]); // invalid index
    }

    // Method to handle exception
    public static void handleException(String[] arr) {
        try {
            System.out.println(arr[arr.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        String[] arr = new String[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        // generateException(arr);
        handleException(arr);
    }
}
