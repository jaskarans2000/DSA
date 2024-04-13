// Q. Shell Rotate


package TwoD_Arrays;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        int k=scn.nextInt();
        int r=scn.nextInt();
        //getOneDArray
        int[] oneD=getOneD(arr,k);
        //rotateOneDArray
        rotateOneDArray(oneD,r);
        //convert 1d to 2d
        convert1DTo2d(oneD,arr,k);
        display(arr);
    }

    public static int[] getOneD(int[][] arr,int shell){
        int minr=shell-1,minc=shell-1,maxr=arr.length-shell,maxc=arr[0].length-shell;
        int len=2*(maxr-minr+1)+2*(maxc-minc+1)-4;
        int[] oneD=new int[len];
        int i=0;
        for(int j=minr;j<=maxr;j++){
            oneD[i]=arr[j][minc];
            i++;
        }
        minc++;
        for(int j=minc;j<=maxc;j++){
            oneD[i]=arr[maxr][j];
            i++;
        }
        maxr--;
        for(int j=maxr;j>=minr;j--){
            oneD[i]=arr[j][maxc];
            i++;
        }
        maxc--;
        for(int j=maxc;j>=minc;j--){
            oneD[i]=arr[minr][j];
            i++;
        }
        return oneD;
    }

    public static int[] convert1DTo2d(int[] oneD,int[][] arr,int shell){
        int minr=shell-1,minc=shell-1,maxr=arr.length-shell,maxc=arr[0].length-shell;
        int i=0;
        for(int j=minr;j<=maxr;j++){
            arr[j][minc]=oneD[i];
            i++;
        }
        minc++;
        for(int j=minc;j<=maxc;j++){
            arr[maxr][j]=oneD[i];
            i++;
        }
        maxr--;
        for(int j=maxr;j>=minr;j--){
            arr[j][maxc]=oneD[i];
            i++;
        }
        maxc--;
        for(int j=maxc;j>=minc;j--){
            arr[minr][j]=oneD[i];
            i++;
        }
        return oneD;
    }

    public static void rotateOneDArray(int[] arr,int k){
        k=k%arr.length;
        if(k<0){
            k+=arr.length;
        }
        reverse(arr,0,arr.length-1-k);
        reverse(arr,arr.length-k,arr.length-1);
        reverse(arr,0,arr.length-1);
    }

    public static void reverse(int[] arr, int st,int end){
        while(st<end){
            int tem=arr[st];
            arr[st]=arr[end];
            arr[end]=tem;
            end--;
            st++;
        }
    }

    public static void display(int[][] arr){
        System.out.println("***");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("***");
    }

}
