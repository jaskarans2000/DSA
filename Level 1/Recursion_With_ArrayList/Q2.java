// Q. Key pad combination
// I/P -> 123
// 1=abc
// 2=def
// 3=ghi



package Recursion_With_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Q2 {
    public static String[] keys=new String[]{".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String input=scn.next();
        ArrayList<String> res=getKPC(input);
        System.out.println(res);
    }

    public static ArrayList<String> getKPC(String str){
        if(str.length()==0){
            ArrayList<String> tres=new ArrayList<>();
            tres.add("");
            return tres;
        }
        ArrayList<String> bres=getKPC(str.substring(1));
        ArrayList<String> res=new ArrayList<>();
        int idx=str.charAt(0)-'0';
        String currentStr=keys[idx];
        for(String st:bres){
            for(int i=0;i<currentStr.length();i++){
                res.add(currentStr.charAt(i)+st);
            }
        }
        return res;
    }
}
