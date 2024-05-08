// Selection sort
// After each sort min gets at its place


package Time_And_Space_Complexity;


import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {
        int[] myArray = new int[]{40, 20, 50, 10};
        selectionSort(myArray);
        System.out.println(Arrays.toString(myArray));
    }

    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }
}
