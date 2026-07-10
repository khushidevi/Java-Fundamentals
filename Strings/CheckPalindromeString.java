//We can do this program without stringbuilder by taking another string and reversing the string using loop.

package Strings;

import java.util.Scanner;

public class CheckPalindromeString {
        public static void main(String arg[]){

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the string");
        StringBuilder str = new StringBuilder(sc.nextLine());
        int size=str.length();

        boolean palindrome=true;

        for(int i=0;i<size/2;i++){
                 char first=str.charAt(i);
                 char last=str.charAt(size-i-1);

                 if(first!=last){
                    palindrome=false;
                    break;
                 }
          }
          if(palindrome){
            System.out.println("String is Palindrome");
          }
          else{
             System.out.println("String is not Palindrome");
          }
                
        sc.close();
    }
    
    
}
