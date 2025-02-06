import java.util.Scanner;

public class p1 {

    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);
        System.out.print("Enter a 5 digit number: "); //Get user input
        String number = UserInput.nextLine();

        if (number.length() != 5) { //Input validation, 5 characters only
            System.out.println("Error: Please enter a 5 digit number");
        }
        else {
            char[] charArray = number.toCharArray(); //converts input to an array of Chars

            // Prints the array of characters with 3 spaces between each character
            System.err.println(charArray[0] +"   " + charArray[1] + "   " + charArray[2] + "   " + charArray[3] + "   " + charArray[4]);
        }
    }
}
