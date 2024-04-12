// Q. Print all subarrays
// 3
// 10 20 30
// 10
// 10 20
// 10 20 30
// 20
// 20 30
// 30


package Functions_And_Arrays;

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+ " ");
                }
                System.out.println();
            }
        }
    }
}
