// Count sort
// When numbers are between a range and repeat a lot like JEE rank list
// Find max and min in array
// Create frequency array of max-min+1 where 0 index maps to min
// loop through the array and make frequency array fmap[arr[i]-min]++
// convert fmap to prefix sum array where each index contains sum of fmap till that array
// additional step to convert preficsum to index you can subtract 1 from all elems 
// make new array equal to original array called result
// loop original array in reverse order and for each elem place it new array at prefixsum[elem-min] position and decrease prefixsum[elem-min]

package Time_And_Space_Complexity;

import java.util.Arrays;

public class Q9 {
    public static void main(String[] args) {
        int[] myArray1 = new int[]{9,6,3,5,3,4,3,9,6,4,6,5,8,9,9};
        countSort(myArray1);
        System.out.println(Arrays.toString(myArray1));
    }

    public static void countSort(int[] arr){
        int min=arr[0],max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int[] fmap=new int[max-min+1];
        for(int i=0;i<arr.length;i++){
            fmap[arr[i]-min]++;
        }
        for(int i=1;i<fmap.length;i++){
            fmap[i]+=fmap[i-1];
        }
        int[] res=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            int pos=fmap[arr[i]-min]-1;
            res[pos]=arr[i];
            fmap[arr[i]-min]--;
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=res[i];
        } 
    }
}
