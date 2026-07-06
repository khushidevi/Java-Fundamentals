package Arrays;

import java.util.*;

public class SumOfElements {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size= sc.nextInt();
        int arr[]= new int[size];

        //input elements in the array

        for(int i=0; i<size; i++){
            System.out.println("Enter element at index " + i + ": ");
            arr[i]= sc.nextInt();
        }

        //sum of elements in the array
        int sum=0;
        for(int i=0; i<size; i++){
            sum+=arr[i];
        }
        System.out.println("Sum of elements in the array: " + sum);
        sc.close();
    }

}
