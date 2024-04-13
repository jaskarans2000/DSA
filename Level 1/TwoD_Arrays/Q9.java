// Q. Search in a sorted 2d array

package TwoD_Arrays;

import java.util.Scanner;

public class Q9 {
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
        int elem=scn.nextInt();
        int i=0,j=m-1;
        while(true){
            if(arr[i][j]>elem){
                j--;
            }else if(arr[i][j]<elem){
                i++;
            }else{
                System.out.println(i+" "+j);
            }
            if(i>=n || j<0){
                System.out.println("Not found");
                break;
            }
        }
    }
}
