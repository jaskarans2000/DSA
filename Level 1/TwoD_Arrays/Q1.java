// Q. Matrix multiplication


package TwoD_Arrays;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n1=scn.nextInt();
        int m1=scn.nextInt();
        int[][] arr1=new int[n1][m1];
        for(int i=0;i<n1;i++){
            for(int j=0;j<m1;j++){
                arr1[i][j]=scn.nextInt();
            }
        }
        int n2=scn.nextInt();
        int m2=scn.nextInt();
        int[][] arr2=new int[n2][m2];
        for(int i=0;i<n2;i++){
            for(int j=0;j<m2;j++){
                arr2[i][j]=scn.nextInt();
            }
        }
        if(m1!=n2){
            System.out.println("Invalid input");
        }else{
            int[][] res=multiply(arr1,arr2);
            for(int i=0;i<n1;i++){
                for(int j=0;j<m2;j++){
                    System.out.print(res[i][j]+" ");
                }
                System.out.println();
            }
        }
    }

    public static int[][] multiply(int[][] arr1, int[][] arr2){
        int[][] res=new int[arr1.length][arr2[0].length];
        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[0].length;j++){
                for(int k=0;k<arr1[0].length;k++){
                    res[i][j]+=arr1[i][k]*arr2[k][j];
                }
            }
        }
        return res;
    }
}
