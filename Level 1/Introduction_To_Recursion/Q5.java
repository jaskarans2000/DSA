// Q. Power linear x^n

package Introduction_To_Recursion;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int x=scn.nextInt();
        int n=scn.nextInt();
        System.out.println(power(x,n));
    }

    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        return x*power(x,n-1);
    }
}
