// Q. Saddle point -> minimum in row and max in col


package TwoD_Arrays;

import java.util.Scanner;

public class Q8 {
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
        int saddle=-1;
        int i=0;
        while(i<n){
            int min=arr[i][0];int mind=0;
            int j=0;
            while(j<m){
                if(arr[i][j]<min){
                    min=arr[i][j];
                    mind=j;
                }
                j++;
            }
            int max=arr[i][mind];
            boolean flag=true;
            for(int row=0;row<n;row++){
                if(row==i){
                    continue;
                }
                if(arr[row][mind]>max){
                    flag=false;
                    break;
                }
            }
            if(flag){
                saddle=arr[i][mind];
                break;
            }
            i++;
        }
        System.out.println(saddle);
    }
}
