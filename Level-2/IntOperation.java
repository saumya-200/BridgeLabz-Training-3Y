
import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("Enter c: ");
        int c = sc.nextInt();

        int result1 = a + b * c; // Multiplication before addition
        int result2 = a * b + c; // Multiplication before addition
        int result3 = c + a / b; // Division before addition
        int result4 = a % b + c; // Modulus before addition

        System.out.println(
                "The results of Int Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);
    }
}
