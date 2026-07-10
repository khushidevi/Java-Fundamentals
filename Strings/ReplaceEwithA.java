package Strings;

import java.util.Scanner;

public class ReplaceEwithA {
    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the string: ");
            String str= sc.nextLine();
            String result=" ";

            for(int i=0;i<str.length();i++){
                char ch=str.charAt(i);
                if(ch=='E'){
                    result+='A';
                }
                else if(ch=='e'){
                    result+='a';
                }
                else{
                    result+=ch;
                }
            }
            System.out.println("The string after replace e with a is: "+ result);
            sc.close();

         }
}
