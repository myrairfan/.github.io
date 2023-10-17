package SortedNumbers.java;
import java.util.Scanner;

public class DisplaySortedNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter three numbers separated by commas
        System.out.print("Enter three numbers separated by commas: ");
        String inputLine = input.nextLine();
        
        // Split the input line to extract the three numbers
        String[] numStrings = inputLine.split(",");
        
        if (numStrings.length != 3) {
            System.out.println("Please enter three numbers separated by commas.");
            return;
        }
        
        double num1 = Double.parseDouble(numStrings[0].trim());
        double num2 = Double.parseDouble(numStrings[1].trim());
        double num3 = Double.parseDouble(numStrings[2].trim());
        
        // Display the numbers in increasing order
        displaySortedNumbers(num1, num2, num3);
        
        input.close();
    }
    
    public static void displaySortedNumbers(double num1, double num2, double num3) {
        // Sort the numbers in increasing order
        if (num1 > num2) {
            double temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num2 > num3) {
            double temp = num2;
            num2 = num3;
            num3 = temp;
        }
        if (num1 > num2) {
            double temp = num1;
            num1 = num2;
            num2 = temp;
        }
        
        // Display the numbers in increasing order
        System.out.println("The numbers in increasing order are: " + num1 + " " + num2 + " " + num3);
    }
}
