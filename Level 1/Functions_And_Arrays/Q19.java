// Q. Ceil and floor


package Functions_And_Arrays;

import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int num=scn.nextInt();
        int floor=arr[0],ceil=arr[n-1];
        int lo=0,hi=n-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]==num){
                floor=arr[mid];
                ceil=arr[mid];
                break;
            }else if(arr[mid]<num){
                floor=arr[mid];
                lo=mid+1;
            }else{
                ceil=arr[mid];
                hi=mid-1;
            }
        }
        System.out.println(floor+" "+ceil);
    }
}
