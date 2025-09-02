import java.util.Scanner;

public class ToLowerCaseDemo {
    // Method to convert manually
    public static String customToLowerCase(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                result += (char) (c + 32);
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

        String manual = customToLowerCase(str);
        String builtin = str.toLowerCase();

        System.out.println("Custom Lowercase: " + manual);
        System.out.println("Built-in Lowercase: " + builtin);
        System.out.println("Comparison: " + compareStrings(manual, builtin));

        sc.close();
    }
}
