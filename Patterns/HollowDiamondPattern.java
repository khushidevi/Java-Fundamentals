package Patterns;

import java.util.Scanner;

public class HollowDiamondPattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        // Upper Half
        for (int i = 1; i <= n; i++) {

            // Leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // Left star
            System.out.print("*");

            // Hollow spaces and right star
            if (i > 1) {
                for (int j = 1; j <= 2 * i - 3; j++) {
                    System.out.print("  ");
                }
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower Half
        for (int i = n - 1; i >= 1; i--) {

            // Leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // Left star
            System.out.print("*");

            // Hollow spaces and right star
            if (i > 1) {
                for (int j = 1; j <= 2 * i - 3; j++) {
                    System.out.print("  ");
                }
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}