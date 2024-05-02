// Q. Get subsequences
// abc
// ---
// --c
// -b-
// -bc
// a--
// a-c
// ab-
// abc

package Recursion_With_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String str=scn.next();
        ArrayList<String> subsequences=getSubsequence(str);
        System.out.println(subsequences);
    }

    public static ArrayList<String> getSubsequence(String str){
        if(str.length()==0){
            ArrayList<String> tres=new ArrayList<>();
            tres.add("");
            return tres;
        }
        ArrayList<String> bres=getSubsequence(str.substring(1));
        ArrayList<String> res=new ArrayList<>(bres);
        for(String st:bres){
            res.add(str.charAt(0)+st);
        }
        return res;
    }
}
