// Sort Dates

package Time_And_Space_Complexity;

import java.util.Arrays;

public class Q11 {
    public static void main(String[] args) {
        String[] myArray1 = new String[]{"01072001","15032024","07082000"};
        sortDates(myArray1);
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

    public static void sortDates(String[] arr){
        //sort on days
        countSort(arr,1000000, 100,31);
        //sort on months
        countSort(arr,10000, 100,12);
        //sort on years
        countSort(arr,1, 10000,2025);
    }

    public static void   countSort(String[] arr,int div, int mod,int range){
        int[] fmap=new int[range];
        for(int i=0;i<arr.length;i++){
             
            int dig=(Integer.parseInt(arr[i],10)/div)%mod;
            fmap[dig]++;
        }
        for(int i=1;i<fmap.length;i++){
            fmap[i]+=fmap[i-1];
        }
        String[] res=new String[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            int dig=(Integer.parseInt(arr[i],10)/div)%mod;
            int pos=fmap[dig]-1;
            res[pos]=arr[i];
            fmap[dig]--;
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=res[i];
        } 
    }
}
