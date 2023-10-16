package Pyramid.java;
import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("   ");
            }

            // Print decreasing numbers to the left of 1
            for (int j = i; j >= 2; j--) {
                System.out.print(j + "  ");
            }

            // Print 1 (center of the pyramid)
            System.out.print("1");

            // Print increasing numbers to the right of 1
            for (int j = 2; j <= i; j++) {
                System.out.print("  " + j);
            }

            System.out.println(); // Move to the next line
        }

        scanner.close();
    }
}

