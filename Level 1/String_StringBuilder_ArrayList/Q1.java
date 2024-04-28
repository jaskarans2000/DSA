// Q. Print all pallindromic substring
// abc -> substrings
// a
// ab
// abc
// b
// bc
// c

// Pallindrome-> abba


package String_StringBuilder_ArrayList;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String str=scn.next();
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                if(isPallindrome(str.substring(i, j))){
                    System.out.println(str.substring(i, j));
                }
            }
        }
    }

    public static boolean isPallindrome(String str){
        int i=0,j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
