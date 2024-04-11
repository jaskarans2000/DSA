// n=5
// *   *   *       *   *   *
// *   *               *   *
// *                       *
// *   *               *   *
// *   *   *       *   *   *



package Patterns;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int st=(n+1)/2,sp=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<st;j++){
                System.out.print("*\t");
            }
            for(int j=0;j<sp;j++){
                System.out.print("\t");
            }
            for(int j=0;j<st;j++){
                System.out.print("*\t");
            }
            System.out.println();
            if(i<n/2){
                sp+=2;
                st--;
            }else{
                sp-=2;
                st++;
            }
        }
    }
}
