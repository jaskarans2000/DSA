// Q. Subsets of array
// 3 abc
// 000  ---
// 001  --c
// 010  -b-
// 011  -bc
// 100  a--
// 101  a-c
// 110  ab-
// 111  abc

package Functions_And_Arrays;

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int nos=(int)Math.pow(2,n);
        for(int i=0;i<nos;i++){
            int binary=getBinary(i);
            String str="";
            for(int j=n-1;j>=0;j--){
                if(binary%10==1){
                    str=arr[j]+str;
                }else{
                    str="-"+str;
                }
                binary/=10;
            }
            System.out.println(str);
        }
    }

    public static int getBinary(int i){
        int binary=0,mul=1;
        while(i>0){
            int rem=i%2;
            binary+=rem*mul;
            mul*=10;
            i/=2;
        }
        return binary;
    }
}
