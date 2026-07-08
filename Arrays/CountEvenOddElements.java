package Arrays;

import java.util.*;

public class CountEvenOddElements{
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];

        //input elements in array

        for(int i=0;i<size;i++){
            System.out.println("Enter the element at index "+i+": ");
            arr[i]= sc.nextInt();
        }

        //Counting Even and Odd elements
        int even = 0;
        int odd = 0;

        for(int i=0;i<size;i++){
            if(arr[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Number of Even elements are :"+ even );
        System.out.println("Number of Odd elements are :"+ odd );
        sc.close();
    }
}
