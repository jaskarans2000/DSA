// Q. Print subsequences

package Recursion_On_The_Way_Up;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String str=scn.next();
        printSubsequence(str,"");
    }

    public static void printSubsequence(String str, String asf){
        if(str.length()==0){
            System.out.println(asf);
            return;
        }
        printSubsequence(str.substring(1), asf);
        printSubsequence(str.substring(1), asf+str.substring(0,1));
    }
}
