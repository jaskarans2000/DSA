// Q. Diagonal traversal
// print upper diagonals of square matrix


package TwoD_Arrays;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        int maxr=n-1;
        for(int j=0;j<n;j++){
            int row=0,col=j;
            while(row<=maxr){
                System.out.print(arr[row][col]+" ");
                row++;
                col++;
            }
            maxr--;
            System.out.println();
        }
    }
}
