package Arrays;

import java.util.Scanner;

public class CheckSortedArray {
       public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int arr[]=new int[size];

        //input elements in the array

        for(int i=0; i<size; i++){
            System.out.println("Enter element at index " + i + ": ");
            arr[i]=sc.nextInt();
        }

        //check if array is sorted or not
        int asc=0;
        int desc=0;

        for(int i=0; i<size-1; i++){
            if(arr[i]<=arr[i+1]){
                asc++;
            }
            if(arr[i]>=arr[i+1]){
                desc++;
            }
            
        }
        if(asc==size-1 || desc==size-1){
           System.out.println("Array is sorted");
        }
        else{
           System.out.println("Array is not sorted"); 
        }
        
        sc.close();
    }
    

}
