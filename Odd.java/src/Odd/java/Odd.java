package Odd.java;
import java.util.Scanner;

public class Odd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Characters at odd positions: ");
        for (int i = 0; i < inputString.length(); i++) {
            if (i % 2 != 0) {
                System.out.print(inputString.charAt(i));
            }
        }

        scanner.close();
    }
}
