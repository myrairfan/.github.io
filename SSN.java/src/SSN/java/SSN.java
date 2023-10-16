package SSN.java;
import java.util.Scanner;

public class SSN {
    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a Social Security number
        System.out.print("Enter a Social Security number (format DDD-DD-DDDD): ");
        String ssn = scanner.nextLine();

        // Close the scanner
        scanner.close();

        // Check if the input matches the valid format
        if (isValidSSN(ssn)) {
            System.out.println("Valid Social Security number.");
        } else {
            System.out.println("Invalid Social Security number.");
        }
    }

    // Helper method to check if a Social Security number is valid
    public static boolean isValidSSN(String ssn) {
        // Define the regular expression pattern for a valid SSN
        String pattern = "\\d{3}-\\d{2}-\\d{4}";

        // Use regex matching to validate the input
        return ssn.matches(pattern);
    }
}
