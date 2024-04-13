// Q. Spiral Display


package TwoD_Arrays;

import java.util.Scanner;

public class Q3 {
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
        int minrow=0,mincol=0,maxrow=n-1,maxcol=m-1,count=0;
        while(count<n*m){
            //down
            for(int i=minrow;i<=maxrow && count<n*m;i++){
                count++;
                System.out.println(arr[i][mincol]);
            }
            mincol++;
            //right
            for(int i=mincol;i<=maxcol && count<n*m;i++){
                count++;
                System.out.println(arr[maxrow][i]);
            }
            maxrow--;
            //top
            for(int i=maxrow;i>=minrow && count<n*m;i--){
                count++;
                System.out.println(arr[i][maxcol]);
            }
            maxcol--;
            //left
            for(int i=maxcol;i>=mincol && count<n*m;i--){
                count++;
                System.out.println(arr[minrow][i]);
            }
            minrow++;
        }
    }
}
