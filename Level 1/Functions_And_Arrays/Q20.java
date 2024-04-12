// Q. First and last index

package Functions_And_Arrays;

import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int elem=scn.nextInt();
        int fi=-1,li=-1,lo=0,hi=n-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]==elem){
                fi=mid;
                hi=mid-1;
            }else if(arr[mid]<elem){
                lo=mid+1;
            }else{
                hi=mid-1;
            }
        }
        lo=0;hi=n-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]==elem){
                li=mid;
                lo=mid+1;
            }else if(arr[mid]<elem){
                lo=mid+1;
            }else{
                hi=mid-1;
            }
        }
        System.out.println(fi+" "+li);
    }
}
