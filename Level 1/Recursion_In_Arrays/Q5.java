// Q. Last occurence

package Recursion_In_Arrays;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int elem=scn.nextInt();
        System.out.println(lastIndex(arr,0,elem));
    }

    public static int lastIndex(int[] arr,int idx, int elem){
        if(idx==arr.length){
            return -1;
        }
        int lastIndex=lastIndex(arr, idx+1, elem);
        if(lastIndex!=-1){
            return lastIndex;
        }else if(arr[idx]==elem){
            return idx;
        }
        return -1;
    }
}
