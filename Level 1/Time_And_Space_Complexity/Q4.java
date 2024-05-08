// Q. Merge two sorted arrays

package Time_And_Space_Complexity;

import java.util.Arrays;

public class Q4 {
    public static void main(String[] args) {
        int[] myArray1 = new int[]{10, 30, 50, 70};
        int[] myArray2 = new int[]{20, 40, 60};
        int[] res=mergeTwoSortedArrays(myArray1,myArray2);
        System.out.println(Arrays.toString(res));
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
