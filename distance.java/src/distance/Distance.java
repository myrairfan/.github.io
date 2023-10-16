package distance;
import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the coordinates of two points
        System.out.print("Enter the coordinates of the first point (x1 y1): ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        
        System.out.print("Enter the coordinates of the second point (x2 y2): ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        
        // Calculate the distance using the formula
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        
        // Display the result
        System.out.println("The distance between the two points is: " + distance);
        
        // Close the Scanner
        input.close();
    }
}
