import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of values: "); //Get input for numebr of values to be searches
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive number of values.");
            return; // Input validation, only positive numbers
        }

        System.out.print("Enter a number: "); //Gets input for the first number
        int smallest = scanner.nextInt();

        for (int i = 1; i < n; i++) { //Loop gets inputs for however many numbers were specified earlier
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();

            if (num < smallest) { //get the smallest value and stores it in "smallest"
                smallest = num;
            }
        }

        System.out.println("The smallest number is: " + smallest);
    }
}

