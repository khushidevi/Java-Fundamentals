package Strings;

import java.util.Scanner;

public class RemoveWhitespace {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        String result=" ";

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==' '){
                continue;
            }
            else{
                result+=ch;
            }
        }
        System.out.println("String after removing whitespace is: "+ result);
        sc.close();
    }
}