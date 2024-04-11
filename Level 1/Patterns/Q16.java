// n=4
// 1                       1
// 1   2               2   1
// 1   2   3       3   2   1
// 1   2   3   4   3   2   1


package Patterns;

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        for(int i=1;i<=n;i++){
            int count=1;
            for(int j=1;j<=2*n-1;j++){
                if(j-i<=0){
                    System.out.print(count+"\t");
                    if(j<n){
                        count++;
                    }
                }else if(2*n-1-j<i){
                    count--;
                    System.out.print(count+"\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
