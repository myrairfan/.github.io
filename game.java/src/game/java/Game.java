package game.java;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Generate a random number (0, 1, or 2) for computer's choice
        int computerChoice = (int) (Math.random() * 3);
        
        // Prompt the user to enter their choice
        System.out.print("Enter 0 for scissor, 1 for rock, or 2 for paper: ");
        int userChoice = input.nextInt();
        
        // Display the computer's choice
        String computerGesture = "";
        switch (computerChoice) {
            case 0:
                computerGesture = "scissor";
                break;
            case 1:
                computerGesture = "rock";
                break;
            case 2:
                computerGesture = "paper";
                break;
        }
        System.out.println("Computer chooses " + computerGesture);
        
        // Determine the winner
        if (userChoice == computerChoice) {
            System.out.println("It's a draw!");
        } else if ((userChoice == 0 && computerChoice == 2) || 
                   (userChoice == 1 && computerChoice == 0) || 
                   (userChoice == 2 && computerChoice == 1)) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }
        
        // Close the scanner
        input.close();
    }
}
