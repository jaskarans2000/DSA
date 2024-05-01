// Q. All indices

package Recursion_In_Arrays;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int elem=scn.nextInt();
        int[] indices=allIndex(arr,0,elem,0);
        for(int i=0;i<indices.length;i++){
            System.out.print(indices[i]+" ");
        }
        System.out.println();
    }

    public static int[] allIndex(int[] arr,int idx, int elem,int fsf){
        if(idx==arr.length){
            int[] bres=new int[fsf];
            return bres;
        }
        int[] res;
        if(arr[idx]==elem){
            res=allIndex(arr, idx+1, elem, fsf+1);
            res[fsf]=idx;
        }else{
            res=allIndex(arr, idx+1, elem, fsf);
        }
        return res;
    }
}
