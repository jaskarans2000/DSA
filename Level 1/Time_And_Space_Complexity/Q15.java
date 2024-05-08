// Q. Pivot in sorted rotated array

package Time_And_Space_Complexity;

public class Q15 {
    public static void main(String[] args) {
        int[] myArray1 = new int[]{30, 40, 50, 10, 20};
        System.out.println(findPivot(myArray1));
    }
    public static int findPivot(int[] arr){
        int lo=0,hi=arr.length-1;
        while(lo<hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]<arr[hi]){
                hi=mid;
            }else if(arr[mid]>arr[hi]){
                lo=mid+1;
            }
        }
        return hi;
    }
}
