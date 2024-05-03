// Q. N queens

package Recursion_Backtracking;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[][] chess=new int[n][n];
        nQueens(chess,0,"");
    }
    public static void nQueens(int[][] chess,int r,String asf){
        if(r==chess.length){
            System.out.println(asf);
            return;
        }
        for(int j=0;j<chess[0].length;j++){
            if(isPossible(chess, r, j)){
                chess[r][j]=1;
                nQueens(chess, r+1, asf+r+"-"+j+",");
                chess[r][j]=0;
            }
        }
    }
    public static boolean isPossible(int[][] chess,int r,int c){
        for(int i=0;i<r;i++){
            if(chess[i][c]==1){
                return false;
            }
        }
        for(int i=0;i<c;i++){
            if(chess[r][i]==1){
                return false;
            }
        }
        for(int i=r-1,j=c-1;i>=0 && j>=0;i--,j--){
            if(chess[i][j]==1){
                return false;
            }
        }
        for(int i=r-1,j=c+1;i>=0 && j<chess[0].length;i--,j++){
            if(chess[i][j]==1){
                return false;
            }
        }
        return true;
    }
}
