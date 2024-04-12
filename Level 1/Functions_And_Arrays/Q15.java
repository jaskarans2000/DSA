// Q. Inverse of an array


package Functions_And_Arrays;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        display(arr);
        int[] inverse=new int[n];
        for(int i=0;i<n;i++){
            inverse[arr[i]]=i;
        }
        display(inverse);
    }

    public static void display(int[] arr){
        System.out.println("*****");
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println("*****");
    }
}
