// Q. Exit point of matrix


package TwoD_Arrays;

import java.util.Scanner;

public class Q4 {
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
        int i=0,j=0,dir=0;
        while(true){
            dir=dir+arr[i][j];
            if(dir%4==0){
                //right-> dir=0
                if(j==m-1){
                    break;
                }
                j++;
            }else if(dir%4==1){
                //down-> dir=1
                if(i==n-1){
                    break;
                }
                i++;
            }else if(dir%4==2){
                //left-> dir=2
                if(j==0){
                    break;
                }
                j--;
            }else{
                //top-> dir=3
                if(i==0){
                    break;
                }
                i--;
            }
        }
        System.out.println("Exit point is: "+ i+ " , "+j);
    }
}
