// n=5
// n=5
//             *
//         *       *
//     *               *
//         *       *
//             *


package Patterns;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int os=n/2,is=-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<os;j++){
                System.out.print("\t");
            }
            System.out.print("*\t");
            for(int j=0;j<is;j++){
                System.out.print("\t");
            }
            if(i!=0 && i!=n-1){
                System.out.print("*\t");
            }
            System.out.println();
            if(i<n/2){
                os--;
                is+=2;
            }else{
                os++;
                is-=2;
            }
        }
    }
}
