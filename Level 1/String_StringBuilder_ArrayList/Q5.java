// Q. Insert ASCII gap between characters
// I/P -> abdgca
// O/P -> a1b2d3g-4c-2a

package String_StringBuilder_ArrayList;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String str=scn.next();
        StringBuilder res=new StringBuilder();
        res.append(str.charAt(0));
        for(int i=1;i<str.length();i++){
            int diff=str.charAt(i)-str.charAt(i-1);
            res.append(diff);
            res.append(str.charAt(i));
        }
        System.out.println(res);
    }
}
