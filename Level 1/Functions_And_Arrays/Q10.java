// Q. Bar chart
// n=5
// 3 2 0 1 1
// *
// *   *
// *   *       *   *


package Functions_And_Arrays;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
            if(max<arr[i]){
               max= arr[i];
            }
        }
        for(int i=max;i>0;i--){
            for(int j=0;j<n;j++){
                if(arr[j]>=i){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
