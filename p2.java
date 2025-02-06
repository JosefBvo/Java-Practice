import java.util.Scanner;


public class p2 {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: "); //get user input and store as an int
        int num = scanner.nextInt();
        
        if (num == reverse(num)) { // Check if the number is a palindrome
            System.out.println("The number " + num + " is a palindrome.");
        } else {
            System.out.println("The number " + num + " is not a palindrome.");
        }
    }

    // Method that reverses a given number
    public static int reverse(int num) {
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return reversed;
    }
    
}
