package Strings;

import java.util.Scanner;

public class ReverseAString {
    public static void main(String arg[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the string");
        StringBuilder str = new StringBuilder(sc.nextLine());
        int size=str.length();

        for(int i=0;i<size/2;i++){
                 char first=str.charAt(i);
                 char last=str.charAt(size-i-1);
                 str.setCharAt(i,last);
                 str.setCharAt(size-i-1,first);


        }
        System.out.println("Reverse string is: "+ str);
        sc.close();
    }
    
}
