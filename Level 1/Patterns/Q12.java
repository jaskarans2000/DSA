// n=5
// 0
// 1   1
// 2   3   5
// 8   13   21   34
// 55  89  144  233  377


package Patterns;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int a=0,b=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(a+"\t");
                int sum=a+b;
                a=b;
                b=sum;
            }
            System.out.println();
        }
    }
}
