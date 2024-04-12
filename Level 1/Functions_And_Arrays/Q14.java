// Q. Rotate an array
// Note: Optimised approach divide into part1 and part 2 the reverse part1 , part2 and reverse complete


package Functions_And_Arrays;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr =new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int k=scn.nextInt();
        k=k%n;
        if(k<0){
            k+=n;
        }
        display(arr);
        // for(int i=0;i<k;i++){
        //     rotate(arr);
        // }
        reverse(arr,0,n-1-k);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
        display(arr);
    }

    public static void reverse(int[] arr, int st,int end){
        while(st<end){
            int temp=arr[st];
            arr[st]=arr[end];
            arr[end]=temp;
            st++;
            end--;
        }
    }

    public static void rotate(int[] arr){
        int elem=arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=elem;
    }

    public static void display(int[] arr){
        System.out.println("*****");
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println("*****");
    }
}
