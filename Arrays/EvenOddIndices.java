package Arrays;

import java.util.Scanner;

public class EvenOddIndices {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        // Input
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element at index " + i + ": ");
            arr[i] = sc.nextInt();
        }

        // Display Array
        System.out.println("Array Elements:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        // Even Index Elements
        System.out.println("\n\nElements at Even Indices:");
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }

        // Odd Index Elements
        System.out.println("\n\nElements at Odd Indices:");
        for (int i = 0; i < size; i++) {
            if (i % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }

        sc.close();
    }
}