// n=5
// 1
// 2   3
// 4   5   6
// 7   8   9   10
// 11  12  13  14  15

package Patterns;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int count=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(count+"\t");
                count++;
            }
            System.out.println();
        }
    }
}
