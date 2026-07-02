package Patterns;

import java.util.Scanner;

public class InvertedFullPyramid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        // Inverted Full Pyramid
        for (int i = n; i >= 1; i--) {

            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // Print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("* ");
            }

            // Move to next line
            System.out.println();
        }

        sc.close();
    }
}