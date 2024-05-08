// Q. Sort01

package Time_And_Space_Complexity;

import java.util.Arrays;

public class Q12 {
    public static void main(String[] args) {
        int[] myArray1 = new int[]{0, 1, 0, 1, 0, 0, 1};
        sort01(myArray1);
        System.out.println(Arrays.toString(myArray1));
    }

    public static void sort01(int[] arr){
        int i=0,j=0;
        while(j<arr.length){
            if(arr[j]==0){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                i++;j++;
            }else{
                j++;
            }
        }
    }
}
