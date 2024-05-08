// Bubble sort
// after each iteration max gets at its place

package Time_And_Space_Complexity;

import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {
        int[] myArray = new int[]{40, 20, 50, 10};
        bubbleSort(myArray);
        System.out.println(Arrays.toString(myArray));
    }

    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
