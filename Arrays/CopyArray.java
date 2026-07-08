package Arrays;

import java.util.Scanner;

public class CopyArray {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int copy[] = new int[size];

        //input elements in the array
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element at index " + i + ": ");
            arr[i] = sc.nextInt();
        }

        //display the array
        System.out.println("The array is: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //copy array

        for (int i =0; i <size; i++) {
            copy[i] = arr[i];
        }

        //printing copied array
        
        System.out.println("The copied array is: ");
        for(int i=0;i<size;i++){
            System.out.print(copy[i] + " ");
        }
        sc.close();

    }
}
