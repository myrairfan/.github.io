package Phone.java;
import java.util.Scanner;

public class Phone {
    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a letter
        System.out.print("Enter a letter (uppercase or lowercase): ");
        char input = scanner.next().charAt(0); // Read the first character of the input

        // Close the scanner
        scanner.close();

        // Convert the letter to lowercase for uniformity
        char lowercaseLetter = Character.toLowerCase(input);

        // Check if the input is a letter
        if (lowercaseLetter >= 'a' && lowercaseLetter <= 'z') {
            // Calculate the corresponding number
            int number = getCorrespondingNumber(lowercaseLetter);
            System.out.println("The corresponding number is: " + number);
        } else {
            // Display an error message for non-letter input
            System.out.println("Invalid input. Please enter a letter.");
        }
    }

    // Helper method to get the corresponding number for a letter
    public static int getCorrespondingNumber(char letter) {
        // Define the mapping of letters to numbers
        String letterMapping = "abcdefghijklmnopqrstuvwxyz";
        String numberMapping = "22233344455566677778889999";

        // Find the index of the letter in the mapping
        int index = letterMapping.indexOf(letter);

        // Get the corresponding number from the mapping
        char correspondingNumber = numberMapping.charAt(index);

        // Convert the character to an integer
        return Integer.parseInt(String.valueOf(correspondingNumber));
    }
}
