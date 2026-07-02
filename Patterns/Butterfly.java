package Patterns;
import java.util.Scanner;

public class Butterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        // Upper half of the butterfly
        for (int i = 1; i <= n; i++) {
            // Print stars on the left side
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // Print spaces in the middle
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }

            // Print stars on the right side
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // Lower half of the butterfly
        for (int i = n; i >= 1; i--) {
            // Print stars on the left side
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // Print spaces in the middle
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }

            // Print stars on the right side
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        sc.close();
    }
}
