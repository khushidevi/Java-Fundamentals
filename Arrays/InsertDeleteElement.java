package Arrays;

import java.util.Scanner;

public class InsertDeleteElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size + 1]; // Extra space for insertion

        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("\n1. Insert Element");
        System.out.println("2. Delete Element");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.print("Enter position to insert (1 to " + (size + 1) + "): ");
                int insertPos = sc.nextInt();

                System.out.print("Enter element to insert: ");
                int element = sc.nextInt();

                for (int i = size; i >= insertPos; i--) {
                    arr[i] = arr[i - 1];
                }

                arr[insertPos - 1] = element;
                size++;

                System.out.println("Array after insertion:");
                for (int i = 0; i < size; i++) {
                    System.out.print(arr[i] + " ");
                }
                break;

            case 2:
                System.out.print("Enter position to delete (1 to " + size + "): ");
                int deletePos = sc.nextInt();

                for (int i = deletePos - 1; i < size - 1; i++) {
                    arr[i] = arr[i + 1];
                }

                size--;

                System.out.println("Array after deletion:");
                for (int i = 0; i < size; i++) {
                    System.out.print(arr[i] + " ");
                }
                break;

            default:
                System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}