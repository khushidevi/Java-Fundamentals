package Strings;

import java.util.Scanner;

public class CountVowelsAndConsonents {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();

        int vowel=0;
        int consonent=0;

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                vowel++;
            }
            else if(ch==' '){
                  continue;
            }
            else{
                consonent++;
            }
        }
        System.out.println("Number of vowels in the string is: "+ vowel);
        System.out.println("Number of consonents in the string is: "+ consonent);
        sc.close();

    }
}
