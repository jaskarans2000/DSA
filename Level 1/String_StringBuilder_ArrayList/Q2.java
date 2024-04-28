// Q. String compression
// I/P -> aaabbccdee
// O/P -> abcde, a3b2c2de2

package String_StringBuilder_ArrayList;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String str=scn.next();
        StringBuilder compressed1=new StringBuilder();
        StringBuilder compressed2=new StringBuilder();
        char ch=str.charAt(0);int count=1;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)!=ch){
                compressed1.append(ch);
                if(count>1){
                    compressed2.append(""+ch+ ""+count);
                }else{
                    compressed2.append(ch);
                }
                count=1;
                ch=str.charAt(i);
            }else{
                count++;
            }
        }
        compressed1.append(ch);
        if(count>1){
            compressed2.append(""+ch+ ""+count);
        }else{
            compressed2.append(ch);
        }
        System.out.println(compressed1);
        System.out.println(compressed2);
    }
}
