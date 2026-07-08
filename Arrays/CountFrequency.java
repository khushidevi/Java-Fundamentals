package Arrays;

import java.util.*;

public class CountFrequency {
      public static void main(String args[]){
              Scanner sc = new Scanner(System.in);
              System.out.println("Enter the size of the array: ");
              int size= sc.nextInt();
              int arr[] = new int[size];

              //Input elements of array 
              
              for(int i=0;i<size;i++){
                System.out.println("Enter element at index "+i+": ");
                  arr[i]=sc.nextInt();
              }

              // Count frequency of each element

              for(int i=0;i<size;i++){
                int count = 0;
                for(int j=0;j<size;j++){
                    if(arr[i]==arr[j]){
                        count++;
                    }
                }

                int j;
                for( j=0;j<i;j++){
                    if(arr[i]==arr[j]){
                        count=0;
                        break;
                    }
                }  
                if(j!=i){
                    continue;
                }
                
                System.out.println("Frequency of " + arr[i] + " is: " + count);
              }

              sc.close();
          }
      }
