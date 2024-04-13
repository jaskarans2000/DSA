// Q. Rotate by 90 degree
// Note: 90 degree rotate is equal to transpose(exchange row and column) then reverse each row


package TwoD_Arrays;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        transpose(arr);
        display(arr);
        reverseRows(arr);
        display(arr);
    }

    public static void transpose(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<=i;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }

    public static void reverseRows(int[][] arr){
        for(int i=0;i<arr.length;i++){
            int left=0,right=arr.length-1;
            while(left<right){
                int temp=arr[i][left];
                arr[i][left]=arr[i][right];
                arr[i][right]=temp;
                left++;
                right--;
            }
        }
    }

    public static void display(int[][] arr){
        System.out.println("***");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("***");
    }
}
