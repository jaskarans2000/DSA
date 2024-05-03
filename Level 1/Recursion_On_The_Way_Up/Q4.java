// Q. Print maze path

package Recursion_On_The_Way_Up;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        printMazePath(0,0,n,m,"");
    }
    public static void printMazePath(int cr,int cc, int dr, int dc,String asf){
        if(cr==dr-1 && cc==dc-1){
            System.out.println(asf);
            return;
        }
        if(cr+1<dr){
            printMazePath(cr+1, cc, dr, dc, asf+"v");
        }
        if(cc+1<dc){
            printMazePath(cr, cc+1, dr, dc, asf+"h");
        }
    }
}
