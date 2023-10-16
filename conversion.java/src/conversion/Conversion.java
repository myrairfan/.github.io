package conversion;
import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter a number in pounds
        System.out.print("Enter a number in pounds: ");
        
        // Read the input as a double
        double pounds = input.nextDouble();
        
        // Convert pounds to kilograms
        double kilograms = pounds * 0.454;
        
        // Display the result
        System.out.println(pounds + " pounds is equal to " + kilograms + " kilograms.");
        
        // Close the Scanner
        input.close();
    }
}
