package Patterns;

import java.util.Scanner;

public class PalindromeNumberTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        // Palindrome Number Triangle
        for (int i = 1; i <= n; i++) {

            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // Print decreasing numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            // Print increasing numbers
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }

            // Move to next line
            System.out.println();
        }

        sc.close();
    }
}