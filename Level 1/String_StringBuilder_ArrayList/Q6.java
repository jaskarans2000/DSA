// Q. Permutations of String
// I/P -> abc
// O/P -> abc, bac, cab, acb, bca, cba
// number of permutations=n!
// 3!=6
// 0 1 2 3 4 5
// 0->0%3=0 a bc 0%2=0 ab c 0%1=0 abc
// 1->1%3=1 b ac 0%2=0 ba c 0%1=0 bac
// 2->2%3=2 c ab 0%2=0 ca b 0%1=0 cab
// 3->3%3=0 a bc 1%2=1 ac b 0%1=0 acb

package String_StringBuilder_ArrayList;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String str=scn.next();
        int noOfSubStr=factorial(str.length());
        for(int i=0;i<noOfSubStr;i++){
            StringBuffer subStr=new StringBuffer();
            StringBuffer strCopy=new StringBuffer(str);
            int divident=i,divisor=str.length();
            while(divisor>0){
                int remainder=divident%divisor;
                subStr.append(strCopy.charAt(remainder));
                strCopy.deleteCharAt(remainder);
                divident=divident/divisor;
                divisor--;
            }
            System.out.println(subStr);
        }
    }

    public static int factorial(int num){
        int prod=1;
        while(num>1){
            prod*=num;
            num--;
        }
        return prod;
    }

}
