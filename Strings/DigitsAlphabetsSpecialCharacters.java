package Strings;

import java.util.Scanner;

public class DigitsAlphabetsSpecialCharacters {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();

        int alphabets=0;
        int digits=0;
        int specialchar=0;

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')){
                alphabets++;
            }
            else if(ch>='0'&& ch<='9'){
                  digits++;
            }
            else if(ch==' '){
                continue;
            }
            else{
                specialchar++;
            }
        }
        System.out.println("Number of alphabets in the string is: "+ alphabets);
        System.out.println("Number of specialcharacters in the string is: "+ specialchar);
        System.out.println("Number of digits in the string is: "+ digits);
        sc.close();

    }
}
