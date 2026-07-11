package Arrays;

import java.util.Scanner;

public class LeftRotateArrayByOne {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int first = arr[0];

        for (int i = 0; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[size - 1] = first;

        System.out.println("Array after left rotation by one:");

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}