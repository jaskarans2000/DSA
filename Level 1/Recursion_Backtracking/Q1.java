// Q. Flood Fill

package Recursion_Backtracking;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        floodFill(arr,0,0,"");
    }

    public static void floodFill(int[][] arr, int r,int c,String asf){
        if(r==arr.length-1 && c==arr[0].length-1){
            System.out.println(asf);
            return;
        }
        arr[r][c]=1;
        if(r-1>=0 && arr[r-1][c]==0){
            floodFill(arr, r-1, c, asf+"t");
        }
        if(c-1>=0 && arr[r][c-1]==0){
            floodFill(arr, r, c-1, asf+"l");
        }
        if(r+1<arr.length && arr[r+1][c]==0){
            floodFill(arr, r+1, c, asf+"d");
        }
        if(c+1<arr[0].length && arr[r][c+1]==0){
            floodFill(arr, r, c+1, asf+"r");
        }
        arr[r][c]=0;
    }
}
