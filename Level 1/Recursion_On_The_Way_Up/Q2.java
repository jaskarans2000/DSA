// Q. print key pad combination


package Recursion_On_The_Way_Up;

import java.util.Scanner;

public class Q2 {

    public static String[] keys=new String[]{".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String str=scn.next();
        printKPC(str,"");
    }

    public static void printKPC(String str,String asf){
        if(str.length()==0){
            System.out.println(asf);
            return;
        }
        int idx=str.charAt(0)-'0';
        String options=keys[idx];
        for(int i=0;i<options.length();i++){
            char ch=options.charAt(i);
            printKPC(str.substring(1), asf+ch);
        }
    }
}
