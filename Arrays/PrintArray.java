package Arrays;

import java.util.*;

public class PrintArray {
    public static void main(String args[]){

         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the size of the array: ");
         int size = sc.nextInt();
         int arr[]= new int[size];

         //input elements in the array
         for(int i=0; i<size; i++){
            System.out.println("Enter element at index " + i + ": ");
            arr[i]= sc.nextInt();
         }

         //print elements of the array
         for(int i=0; i<size; i++){ 
            System.out.print(arr[i]+" ");

         }
         sc.close();

    }
}
