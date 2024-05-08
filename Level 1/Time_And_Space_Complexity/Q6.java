// pivot index of array
// pivot index is such that all the elements less than or equal to elem lie on left and greater lie on right

package Time_And_Space_Complexity;

import java.util.Arrays;

public class Q6 {
    public static void main(String[] args) {
        int[] myArray1 = new int[]{50, 60, 20, 10, 70, 30, 40};
        int pivot = 40;
        int pi=pivotIndex(myArray1,pivot);
        System.out.println(Arrays.toString(myArray1)+" "+pi);
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
        return i;
    }
}
