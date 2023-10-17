package ValidatePassword.java;
import java.util.Scanner;

public class ValidatePassword {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter a password
        System.out.print("Enter a password: ");
        String password = input.nextLine();
        
        // Check if the password is valid
        if (isValidPassword(password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
        
        input.close();
    }
    
    public static boolean isValidPassword(String password) {
        // Rule 1: Password must have at least eight characters
        if (password.length() < 8) {
            return false;
        }
        
        // Rule 2: Password must contain only letters and digits
        for (char ch : password.toCharArray()) {
            if (!Character.isLetterOrDigit(ch)) {
                return false;
            }
        }
        
        // Rule 3: Password must contain at least two digits
        int digitCount = 0;
        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) {
                digitCount++;
                if (digitCount >= 2) {
                    // At least two digits found, so the password is valid
                    return true;
                }
            }
        }
        
        // If we reach here, the password is invalid
        return false;
    }
}
