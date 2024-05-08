// Merge sort
// Use recursion to break array int two half then merge two sorted arrays

package Time_And_Space_Complexity;

import java.util.Arrays;

public class Q5 {
    public static void main(String[] args) {
        int[] myArray1 = new int[]{50, 60, 20, 10, 70, 30, 40};
        int[] res=mergeSort(myArray1,0,myArray1.length-1);
        System.out.println(Arrays.toString(res));
    }

    public static int[] mergeSort(int[] arr,int si,int ei){
        if(si==ei){
            int[] bres=new int[1];
            bres[0]=arr[si]; 
            return bres;
        }
        int mid=si+(ei-si)/2;
        int[] arr1=mergeSort(arr, si, mid);
        int[] arr2=mergeSort(arr, mid+1, ei);
        return mergeTwoSortedArrays(arr1,arr2);
    }

    public static int[] mergeTwoSortedArrays(int[] arr1,int[] arr2){
        int[] res=new int[arr1.length+arr2.length];
        int i=0,j=0,k=0;
        while(j<arr1.length && k<arr2.length){
            if(arr1[j]<arr2[k]){
                res[i]=arr1[j];
                j++;
            }else{
                res[i]=arr2[k];
                k++;
            }
            i++;
        }
        while(j<arr1.length){
            res[i]=arr1[j];
            j++;
            i++;
        }
        while(k<arr2.length){
            res[i]=arr2[k];
            k++;
            i++;
        }
        return res;
    }
}
