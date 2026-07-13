package Patterns;

import java.util.Scanner;

public class Hourglass{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        // Upper Half
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * (n - i) - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower Half
        for (int i = n - 2; i >= 0; i--) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * (n - i) - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}
