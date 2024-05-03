// Q. Target sum subsets

package Recursion_Backtracking;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int sum=scn.nextInt();
        printTargetSum(arr,0,"",sum);
    }

    public static void printTargetSum(int[] arr, int idx, String asf, int sum){
        if(idx==arr.length){
            if(sum==0){
                System.out.println(asf+".");
            }
            return;
        }
        printTargetSum(arr, idx+1, asf+arr[idx]+" ", sum-arr[idx]);
        printTargetSum(arr, idx+1, asf, sum);
    }
}
