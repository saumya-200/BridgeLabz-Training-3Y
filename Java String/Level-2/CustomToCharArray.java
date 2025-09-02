import java.util.Scanner;

public class CustomToCharArray {

    // Method to convert string into char array
    public static char[] customToCharArray(String text) {
        char[] arr = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            arr[i] = text.charAt(i);
        }
        return arr;
    }

    // Method to compare two char arrays
    public static boolean compareArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length)
            return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();

        char[] customArr = customToCharArray(text);
        char[] builtInArr = text.toCharArray();

        System.out.println("Custom Char Array: ");
        for (char c : customArr)
            System.out.print(c + " ");

        System.out.println("\nBuilt-in Char Array: ");
        for (char c : builtInArr)
            System.out.print(c + " ");

        System.out.println("\nArrays are equal? " + compareArrays(customArr, builtInArr));
    }
}
