package Arrays;

import java.util.*;

public class AverageOfArray {
        public static void main(String args[]){

            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the size of the array: ");
            int size= sc.nextInt();
            int arr[]=new int[size];

            //input elements in the array

            for(int i=0; i<size; i++){
                System.out.println("Enter element at index " + i + ": ");
                arr[i]=sc.nextInt();
            }

            //average of elements in the array

            int sum=0;
            for(int i=0; i<size; i++){
                sum+=arr[i];
            }
            float average= (float)sum/size;
            System.out.println("Average of elements in the array: " + average);
            sc.close();

        }
    
}
