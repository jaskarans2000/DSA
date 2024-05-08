// Quick sort

package Time_And_Space_Complexity;

import java.util.Arrays;

public class Q7 {
    public static void main(String[] args) {
        int[] myArray1 = new int[]{50, 60, 20, 10, 70, 30, 40};
        QuickSort(myArray1,0,myArray1.length-1);
        System.out.println(Arrays.toString(myArray1));
    }

    public static void QuickSort(int[] myArray1,int si,int ei){
        if(si>ei){return;}
        int pi=pivotIndex(myArray1, myArray1[ei]);
        QuickSort(myArray1, si, pi-1);
        QuickSort(myArray1, pi+1, ei);

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
