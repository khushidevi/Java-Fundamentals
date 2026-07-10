//We can directly find the length using str.length() only but i have used loop for more understanding of loops.
package Strings;

import java.util.*;

public class LengthOfString {
     public static void main(String args[]){

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the string");
            String str = sc.nextLine();
  
            int count=0;
            int i;
            for(i=0;i<str.length();i++){
                count++;
            }
            System.out.println("Length of string is: "+count);
            sc.close();
     }
}
