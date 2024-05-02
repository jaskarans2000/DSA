// Q. Get Maze paths

package Recursion_With_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Q4 {
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
        if(cc+1<fc){
            ArrayList<String> bres=getMazePaths(fr, fc, cr, cc+1);
            for(String st:bres){
                res.add("h"+st);
            }
        }
        if(cr+1<fr){
            ArrayList<String> bres=getMazePaths(fr, fc, cr+1, cc);
            for(String st:bres){
                res.add("v"+st);
            }
        }
        return res;
    }
}
