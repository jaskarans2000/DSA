// Sort 012

package Time_And_Space_Complexity;

import java.util.Arrays;

public class Q13 {
    public static void main(String[] args) {
        int[] myArray1 = new int[]{0, 1, 2, 1, 0, 0, 1, 2};
        sort012(myArray1);
        System.out.println(Arrays.toString(myArray1));
    }

    public static void sort012(int[] arr){
        int i=0,j=0,k=arr.length-1;
        while(j<=k){
            if(arr[j]==0){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                i++;j++;
            }else if(arr[j]==2){
                int temp=arr[j];
                arr[j]=arr[k];
                arr[k]=temp;
                k--;
            }else{
                j++;
            }
        }
    }
}
