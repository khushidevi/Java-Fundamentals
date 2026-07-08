package Arrays;
import java.util.*;

public class SecondLargestElement {
          public static void main(String args[]){
                  Scanner sc = new Scanner(System.in);
                  System.out.println("Enter the size of the array");
                  int size = sc.nextInt();
                  int arr[] = new int[size];

                  //input elements in the array
                  for (int i = 0; i < size; i++) {
                         System.out.println("Enter element at index " + i + ": ");
                         arr[i] = sc.nextInt();
                  }

                  //Printing second largest number
                  int max=arr[0];
                  for(int i=1; i<size; i++){
                        if(arr[i]>max){
                        max=arr[i];
                        }
                   }
                   int second=0;
                   for(int j=0;j<size;j++){
                    if(arr[j]!=max){
                          second= arr[j];
                          break;
                    }
                   }
                   for(int j=0;j<size;j++){
                      if(arr[j]== max){
                           continue;
                      }
                      else if(arr[j]>second){
                        second=arr[j];
                      }
                   }
                   System.out.println("Second Maximum element in the array: " + second);
                   sc.close();
          }
    
}
