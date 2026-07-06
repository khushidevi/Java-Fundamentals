package Arrays;

import java.util.*;

public class ReverseArray {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int arr[] = new int[size];

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

        //reverse the array
        System.out.println("The reversed array is: ");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        sc.close();

        /*we can also reverse the array by considering on reverse array
        int revArr[] = new int[size];
        for (int i = 0; i < size; i++) {
            revArr[i] = arr[size - 1 - i];
        }
        */
    }
    
    
}
