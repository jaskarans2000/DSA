// n=5
// 1
// 1   1
// 1   2   1
// 1   3   3   1
// 1   4   6   4   1
// 1   5   10  10  5   1
// Note: nCr=n!/((n-r)!*r!)
// nC0 || nCn=1
// nCk+1=(nCk(n-k))/(k+1)

package Patterns;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        for(int i=0;i<n;i++){
            int nck=1;
            for(int j=0;j<=i;j++){
                System.out.print(nck+"\t");
                int nck1=(nck*(i-j))/(j+1);
                nck=nck1;
            }
            System.out.println();
        }
    }
}
