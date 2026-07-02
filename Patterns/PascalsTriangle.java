package Patterns;

import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        // Pascal's Triangle
        for (int i = 0; i < n; i++) {

            // Print leading spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }

            int num = 1;

            // Print values in the current row
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");

                // Calculate the next value
                num = num * (i - j) / (j + 1);
            }

            System.out.println();
        }

        sc.close();
    }
}
