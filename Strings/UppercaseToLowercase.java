//We can use toLowerCase() built-in library method to convert uppercase to lowercase.

package Strings;

import java.util.Scanner;

public class UppercaseToLowercase{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();

        System.out.println("String afer changing from uppercase to lowercase is: ");
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(ch>='A'&&ch<='Z'){
                ch=(char)(ch+32);
            }
            System.out.print(ch);
            
        }
        sc.close();
    }
}