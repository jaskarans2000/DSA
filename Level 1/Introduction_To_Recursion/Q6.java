// Q. Power logarithmic x^n

package Introduction_To_Recursion;

import java.util.Scanner;

public class Q6 {
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
        int pxn2=power(x,n/2);
        if(n%2==0){
            return pxn2*pxn2;
        }
        return x*pxn2*pxn2;
    }
}
