// Q. Display an array using recursion

package Recursion_In_Arrays;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        displayArr(arr,n);
    }

    public static void displayArr(int[] arr, int n){
        if(n==0){
            return;
        }
        displayArr(arr, n-1);
        System.out.println(arr[n-1]);
    }
}
