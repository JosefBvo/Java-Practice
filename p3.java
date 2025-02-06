public class p3 {
    public static void main(String[] args) {
        int n = 5;

        // Upper half begins
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" "); // Print spaces
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*"); // Print asterisks
            }
            System.out.println(); // Upper half ends
        }

        // Lower half begins
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" "); // Print spaces
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*"); // Print asterisks
            }
            System.out.println(); // Lower half ends
        }
    }
}

