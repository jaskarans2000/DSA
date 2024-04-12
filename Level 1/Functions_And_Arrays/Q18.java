// Q. Binary Search


package Functions_And_Arrays;

import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int elem=scn.nextInt();
        int idx=-1,lo=0,hi=n-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]==elem){
                idx=mid;
                break;
            }else if(arr[mid]<elem){
                lo=mid+1;
            }else{
                hi=mid-1;
            }
        }
        System.out.println(idx);
    }
}
