// Q. Insertion sort
// Assume first element is sorted then in each iteration add element to correct position using reverse bubble sort

package Time_And_Space_Complexity;

import java.util.Arrays;

public class Q3 {
    public static void main(String[] args) {
        int[] myArray = new int[]{40, 20, 50, 10};
        insertionSort(myArray);
        System.out.println(Arrays.toString(myArray));
    }

    public static void insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int j=i;
            while( j>0 && arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }
}
