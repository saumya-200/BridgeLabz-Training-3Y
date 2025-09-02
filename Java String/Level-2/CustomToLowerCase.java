import java.util.Scanner;

public class CustomToLowerCase {

    // Method to convert to lowercase manually
    public static String toLowerCustom(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                c = (char) (c + 32); // ASCII conversion
            }
            result += c;
        }
        return result;
    }

    // Compare two strings
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String customLower = toLowerCustom(text);
        String builtInLower = text.toLowerCase();

        System.out.println("Custom Lowercase: " + customLower);
        System.out.println("Built-in Lowercase: " + builtInLower);
        System.out.println("Are both same? " + compareStrings(customLower, builtInLower));
    }
}
