// Q. Print zigzag
// Pre 2
// Pre 1
// In 1
// Post 1
// In 2
// Pre 1
// In 1 
// Post 1
// Post 2

package Introduction_To_Recursion;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        pzz(n);
    }

    public static void pzz(int n){
        if(n==0){
            return;
        }
        System.out.println("Pre: "+n);
        pzz(n-1);
        System.out.println("In: "+n);
        pzz(n-1);
        System.out.println("Post: "+n);
    }
}
