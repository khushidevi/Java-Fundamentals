package Strings;

import java.util.Scanner;

public class FirstNonRepeatingCharacter {
     public static void main(String arg[]){

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the string");
        String str= sc.nextLine();
        
       
        for(int i=0;i<str.length();i++){
              if(str.charAt(i)==' '){
                    continue;
                }
              int count=0;
              for(int j=0;j<str.length();j++){
                if(str.charAt(j)==' '){
                    continue;
                }
                else if(i==j){
                    continue;
                }
                else if(str.charAt(i)==str.charAt(j)){
                   count++;
                }
              }
              if(count==0){
                       System.out.println(str.charAt(i)+" is the first non repeating character ");
                       break;
                
              }
              

        }
        sc.close();
    }
}
