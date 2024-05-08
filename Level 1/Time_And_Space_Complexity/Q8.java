// K-Select i.e kth smallest element in array

package Time_And_Space_Complexity;

import java.util.Arrays;

public class Q8 {
    public static void main(String[] args) {
        int[] myArray1 = new int[]{50, 60, 20, 10, 70, 30, 40};
        int k=2;
        // System.out.println(kSelect(myArray1,k));
        System.out.println(kSelectRecur(myArray1, k, 0, myArray1.length-1));
    }

    public static int kSelect(int[] arr, int k){
        int piv=arr[arr.length-1];
        while(true){
            int pi=pivotIndex(arr, piv);
            if(pi==k-1){
                return piv;
            }else if(pi>k-1){
                piv=arr[pi-1];
            }else{
                piv=arr[pi+1];
            }
        }
    }

    public static int kSelectRecur(int[] arr, int k, int si, int ei){
        int piv=arr[ei];
        int pi=pivotIndex(arr, piv);
        if(pi==k-1){
            return piv;
        }else if(pi>k-1){
            return kSelectRecur(arr, k, si, pi-1);
        }else{
            return kSelectRecur(arr, k, pi+1, ei);
        }
    }

    public static int pivotIndex(int[] arr,int pivot){
        int i=0,j=0;
        while(j<arr.length){
            if(arr[j]<=pivot){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                i++;j++;
            }else{
                j++;
            }
        }
        return i-1;
    }
}
