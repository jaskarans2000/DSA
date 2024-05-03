// Q. Knights Tour

package Recursion_Backtracking;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[][] chess=new int[n][n];
        int sr=scn.nextInt();
        int sc=scn.nextInt();
        knightsTour(chess,sr,sc,1);
    }

    public static void knightsTour(int[][] chess,int sr,int sc,int marked){
        if(sr<0 || sc<0 || sr>=chess.length || sc>=chess[0].length || chess[sr][sc]!=0){
            return;
        }
        if(marked==chess.length*chess[0].length){
            chess[sr][sc]=marked;
            display(chess);
            chess[sr][sc]=0;
            return;
        }
        chess[sr][sc]=marked;
        knightsTour(chess, sr-2, sc+1, marked+1);
        knightsTour(chess, sr-1, sc+2, marked+1);
        knightsTour(chess, sr+1, sc+2, marked+1);
        knightsTour(chess, sr+2, sc+1, marked+1);
        knightsTour(chess, sr+2, sc-1, marked+1);
        knightsTour(chess, sr+1, sc-2, marked+1);
        knightsTour(chess, sr-1, sc-2, marked+1);
        knightsTour(chess, sr-2, sc-1, marked+1);
        chess[sr][sc]=0;
    }

    public static void display(int[][] arr){
        System.out.println("*********");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("*********");
    }
}
