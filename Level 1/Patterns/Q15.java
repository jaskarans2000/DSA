// n=5
//         1
//     2   3   2
// 3   4   5   4   3
//     2   3   2
//         1


package Patterns;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int sp=n/2,st=1,count=1;
        for(int i=0;i<n;i++){
            int temp=count;
            for(int j=0;j<sp;j++){
                System.out.print("\t");
            }
            for(int j=0;j<st;j++){
                System.out.print(temp+"\t");
                if(j<st/2){
                    temp++;
                }else{
                    temp--;
                }
            }
            if(i<n/2){
                sp--;
                st+=2;
                count++;
            }else{
                sp++;
                st-=2;
                count--;
            }
            System.out.println();
        }
    }
}
