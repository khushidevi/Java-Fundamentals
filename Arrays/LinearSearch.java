package Arrays;

import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int arr[] = new int[size];

        //input elements in the array
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element at index " + i + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched");
        int key = sc.nextInt();

        //linear search

        int count = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index " + i);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Element not found in the array");
        }
        sc.close();
    }
}   