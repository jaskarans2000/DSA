// Q. Print maze path with jumps

package Recursion_On_The_Way_Up;

import java.util.Scanner;

public class Q5 {
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
        for(int i=1;cr+i<dr;i++){
            printMazePath(cr+i, cc, dr, dc, asf+"v"+i);
        }
        for(int i=1;cc+i<dc;i++){
            printMazePath(cr, cc+i, dr, dc, asf+"h"+i);
        }
        for(int i=1;cr+i<dr && cc+i<dc;i++){
            printMazePath(cr, cc+i, dr, dc, asf+"d"+i);
        }
    }
}
