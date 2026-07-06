package Arrays;
import java.util.*;
public class FindMaxElement {
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

        //find max element in the array
        int max=arr[0];
        for(int i=1; i<size; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Maximum element in the array: " + max);
        sc.close();
    }
}
