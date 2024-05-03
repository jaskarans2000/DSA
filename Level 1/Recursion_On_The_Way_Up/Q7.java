// Q. Print encodings

package Recursion_On_The_Way_Up;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String str=scn.next();
        printEncodings(str,"");
    }
    public static void printEncodings(String str, String asf){
        if(str.length()==0){
            System.out.println(asf);
            return;
        }
        if(str.charAt(0)=='0'){
            return;
        }
        char encoding=(char)(str.charAt(0)-'1'+'a');
        printEncodings(str.substring(1), asf+encoding);
        if(str.length()>1){
            int num=Integer.parseInt(str.substring(0,2));
            if(num<=26){
                char ch=(char)(num-1+'a');
                printEncodings(str.substring(2), asf+ch);
            }
        }
    }
}
