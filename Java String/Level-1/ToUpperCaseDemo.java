import java.util.Scanner;

public class ToUpperCaseDemo {
    // Method to convert manually
    public static String customToUpperCase(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                result += (char) (c - 32);
            } else {
                result += c;
            }
        }
        return result;
    }

    // Method to compare two strings
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

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String manual = customToUpperCase(str);
        String builtin = str.toUpperCase();

        System.out.println("Custom Uppercase: " + manual);
        System.out.println("Built-in Uppercase: " + builtin);
        System.out.println("Comparison: " + compareStrings(manual, builtin));

        sc.close();
    }
}
