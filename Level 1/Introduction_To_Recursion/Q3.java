// Q. Print decreasing increasing
// n=5 5432112345


package Introduction_To_Recursion;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        pdi(n);
    }

    public static void pdi(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        pdi(n-1);
        System.out.println(n);
    }
}
