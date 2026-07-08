package Arrays;

import java.util.Scanner;

public class MergeArray {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of first array");
        int size1 = sc.nextInt();
        System.out.println("Enter the size of second array");
        int size2 = sc.nextInt();
        int arr1[] = new int[size1];
        int arr2[] = new int[size2];

        //input elements in the first array
        
        System.out.println("For first array");
        for (int i = 0; i < size1; i++) {
            System.out.println("Enter element at index " + i + ": ");
            arr1[i] = sc.nextInt();
        }

        //input elements in second array
        System.out.println("For second array");
        for (int i = 0; i < size2; i++) {
            System.out.println("Enter element at index " + i + ": ");
            arr2[i] = sc.nextInt();
        }
        

        //display first array
        System.out.println("The first array is: ");
        for (int i = 0; i < size1; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        //display second array

        System.out.println("The second array is: ");
        for (int i = 0; i < size2; i++) {
            System.out.print(arr2[i] + " ");
        }
        sc.close();

        //Merging both the arrays
        int size3= size1+size2;
        int arr3[]= new int[size3];

        //Merge first array

        for (int i = 0; i < size1; i++) {
             arr3[i] = arr1[i];
        }

        // Merge second array
        for (int i = 0; i < size2; i++) {
             arr3[size1 + i] = arr2[i];
        }

        System.out.println();
        System.out.println("Merged Array:");
        for (int i = 0; i < size3; i++) {
           System.out.print(arr3[i] + " ");
        }


    }
}
