// Q. Reverse an array


package Functions_And_Arrays;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        display(arr);
        int i=0,j=n-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        display(arr);
    }

    public static void display(int[] arr){
        System.out.println("*****");
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println("*****");
    }
}
