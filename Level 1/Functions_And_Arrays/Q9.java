// Q. Find element in array


package Functions_And_Arrays;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int elem=scn.nextInt();
        int idx=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==elem){
                idx=i;
                break;
            }
        }
        System.out.println(idx);
    }
}
