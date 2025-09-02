import java.util.Scanner;

public class ArrayIndexDemo {
    public static void generateException(String[] arr) {
        System.out.println(arr[arr.length]); // Invalid index
    }

    public static void handleException(String[] arr) {
        try {
            System.out.println(arr[arr.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handled Exception: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        String[] arr = new String[size];
        System.out.println("Enter " + size + " names:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.next();
        }

        // generateException(arr);
        handleException(arr);

        sc.close();
    }
}
