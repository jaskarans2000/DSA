// Q. Span of an array
// I/P -> number n, n number of elements
// O/P -> Span i.e max-min


package Functions_And_Arrays;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(max-min);
    }
}
