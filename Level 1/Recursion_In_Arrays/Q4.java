// Q. First index

package Recursion_In_Arrays;

import java.util.Scanner;

public class Q4 {
   public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int elem=scn.nextInt();
        System.out.println(firstIndex(arr,0,elem));
   } 

   public static int firstIndex(int[] arr,int idx, int elem){
    if(idx==arr.length){
        return -1;
    }
    if(arr[idx]==elem){
        return idx;
    }
    return firstIndex(arr, idx+1, elem);
   }
}
