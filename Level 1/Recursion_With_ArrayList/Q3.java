// Q. Get stair paths

package Recursion_With_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        ArrayList<String> paths=getStairPaths(n);
        System.out.println(paths);
    }

    public static ArrayList<String> getStairPaths(int n){
        if(n==0){
            ArrayList<String> bres=new ArrayList<>();
            bres.add("");
            return bres;
        }
        ArrayList<String> res=new ArrayList<>();
        if(n-1>=0){
            ArrayList<String> bres=getStairPaths(n-1);
            for(String st:bres){
                res.add("1"+st);
            }
        }
        if(n-2>=0){
            ArrayList<String> bres=getStairPaths(n-2);
            for(String st:bres){
                res.add("2"+st);
            }
        }
        if(n-3>=0){
            ArrayList<String> bres=getStairPaths(n-3);
            for(String st:bres){
                res.add("3"+st);
            }
        }
        return res;
    }
}
