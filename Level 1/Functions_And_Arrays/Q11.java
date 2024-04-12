// Q. sum of two arrays
// I/p -> size of first array, elements of first array, size of second array, elements of second array
// O/P -> sum of two arrays


package Functions_And_Arrays;

import java.util.Scanner;

public class Q11 {
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args) {
        int size1=scn.nextInt();
        int[] arr1=new int[size1];
        takeInput(arr1,size1);
        int size2=scn.nextInt();
        int[] arr2=new int[size2];
        takeInput(arr2,size2);
        int[] res=addition(arr1,arr2);
        boolean flag=false;
        for(int i=0;i<res.length;i++){
            if(res[i]!=0){
                flag=true;
            }
            if(flag)
            System.out.print(res[i]+" ");
        }
    }

    public static void takeInput(int[] arr,int size){
        for(int i=0;i<size;i++){
            arr[i]=scn.nextInt();
        }
    }

    public static int[] addition(int[] arr1, int[] arr2){
        int l1=arr1.length,l2=arr2.length;
        int l3=l1>l2?l1+1:l2+1;
        int[] res=new int[l3];
        int carry=0;
        while(l1>0 || l2>0 || carry>0){
            int num1=0,num2=0;
            if(l1>0){
                num1=arr1[l1-1];
            }
            if(l2>0){
                num2=arr2[l2-1];
            }
            res[l3-1]=(num1+num2+carry)%10;
            carry=(num1+num2+carry)/10;
            l1--;
            l2--;
            l3--;
        }
        return res;
    }
}
