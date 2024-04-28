// Q. toggle cases
// I/P -> pepCoDing
// O/P -> PEPcOdING

package String_StringBuilder_ArrayList;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String str=scn.next();
        StringBuilder toggle=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='a' && ch<='z'){
                char newChar=(char)('A'+ch-'a');
                toggle.append(newChar);
            }else{
                char newChar=(char)('a'+ch-'A');
                toggle.append(newChar);
            }
        }
        System.out.println(toggle);
    }
}
