package Cost.java;
import java.util.Scanner;

public class Cost {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the weight and price of the first package
        System.out.print("Enter the weight of the first package (in kilograms): ");
        double weight1 = input.nextDouble();
        System.out.print("Enter the price of the first package: $");
        double price1 = input.nextDouble();
        
        // Prompt the user to enter the weight and price of the second package
        System.out.print("Enter the weight of the second package (in kilograms): ");
        double weight2 = input.nextDouble();
        System.out.print("Enter the price of the second package: $");
        double price2 = input.nextDouble();
        
        // Calculate the cost per kilogram for each package
        double costPerKilogram1 = price1 / weight1;
        double costPerKilogram2 = price2 / weight2;
        
        // Compare the costs and determine which one is better
        if (costPerKilogram1 < costPerKilogram2) {
            System.out.println("The first package is a better deal.");
        } else if (costPerKilogram1 > costPerKilogram2) {
            System.out.println("The second package is a better deal.");
        } else {
            System.out.println("Both packages have the same price per kilogram.");
        }
        
        // Close the scanner
        input.close();
    }
}
