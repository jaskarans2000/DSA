// Q. Get maze paths with jumps

package Recursion_With_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        ArrayList<String> mazePaths=getMazePaths(n,m,0,0);
        System.out.println(mazePaths);
    }

    public static ArrayList<String> getMazePaths(int fr,int fc,int cr,int cc){
        if(cr==fr-1 && cc==fc-1){
            ArrayList<String> bres=new ArrayList<>();
            bres.add("");
            return bres;
        }
        ArrayList<String> res=new ArrayList<>();
        for(int i=1;cc+i<fc;i++){
            ArrayList<String> bres=getMazePaths(fr, fc, cr, cc+i);
            for(String st:bres){
                res.add("h"+i+st);
            }
        }
        for(int i=1;cr+i<fr;i++){
            ArrayList<String> bres=getMazePaths(fr, fc, cr+i, cc);
            for(String st:bres){
                res.add("v"+i+st);
            }
        }
        for(int i=1,j=1;cr+i<fr && cc+j<fc;i++,j++){
            ArrayList<String> bres=getMazePaths(fr, fc, cr+i, cc+i);
            for(String st:bres){
                res.add("d"+i+st);
            }
        }
        return res;
    }
}
