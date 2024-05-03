// Q. Print permutations

package Recursion_On_The_Way_Up;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String str=scn.next();
        printPermutations(str,"");
    }

    public static void printPermutations(String str, String asf){
        if(str.length()==0){
            System.out.println(asf);
            return;
        }
        for(int i=0;i<str.length();i++){
            printPermutations(str.substring(0, i)+str.substring(i+1), asf+str.charAt(i));
        }
    }
}
