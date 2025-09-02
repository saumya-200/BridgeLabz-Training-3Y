public class NullPointerDemo {
    // Method to generate NullPointerException
    public static void generateException() {
        String text = null;
        System.out.println(text.length()); // This throws NullPointerException
    }

    // Method to handle NullPointerException
    public static void handleException() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Handled NullPointerException: " + e);
        }
    }

    public static void main(String[] args) {
        // generateException(); // Uncomment to see exception

        handleException(); // Safe handling
    }
}
