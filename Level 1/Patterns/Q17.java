// n=5
//         *      
//         *   *   
// *   *   *   *   *
//         *   *   
//         *      


package Patterns;

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int st=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j>=n/2 ){
                    if(j<=n/2+st){
                        System.out.print("*\t");
                    }else{
                        System.out.print("\t");
                    }
                }else{
                    if(i==n/2){
                        System.out.print("*\t");
                    }else{
                        System.out.print("\t");
                    }
                }
            }
            if(i<n/2){
                st++;
            }else{
                st--;
            }
            System.out.println();
        }
    }
}
