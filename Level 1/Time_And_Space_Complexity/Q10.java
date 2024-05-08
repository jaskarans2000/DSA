// Radix sort
// Improved version of count sort as it decreases the fmap range to 0-9. It sorts numbers based on the digits. First sort based on 1's then 10's then 100's and so on

package Time_And_Space_Complexity;

import java.util.Arrays;

public class Q10 {
    public static void main(String[] args) {
        int[] myArray1 = new int[]{962,61,310,521,323,410,1000,398,987,620,460,630,5,89,91,921};
        radixSort(myArray1);
        System.out.println(Arrays.toString(myArray1));
    }

    public static int findMax(int[] arr){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    public static void radixSort(int[] arr){
        int pow=1;
        int max=findMax(arr);
        while(pow<=max){
            countSort(arr,pow);
            pow*=10;
        } 
    }

    public static void   countSort(int[] arr,int exp){
        int[] fmap=new int[10];
        for(int i=0;i<arr.length;i++){
            int dig=(arr[i]/exp)%10;
            fmap[dig]++;
        }
        for(int i=1;i<fmap.length;i++){
            fmap[i]+=fmap[i-1];
        }
        int[] res=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            int dig=(arr[i]/exp)%10;
            int pos=fmap[dig]-1;
            res[pos]=arr[i];
            fmap[dig]--;
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=res[i];
        } 
    }
}
