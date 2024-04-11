// Prime Factorization
// Question Statement: 
// 1. You are required to display the prime factorization of a number.
// 2. Take as input a number n.
// 3. Print all its prime factors from smallest to largest.

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();
        int k=2;
        // approach 1
        // while(num>1){
        //     if(num%k==0){
        //         System.out.println(k);
        //         num/=k;
        //     }else{
        //         k++;
        //     }
        // }
        //appoach2 More optimised
        while(k*k<=num){
            if(num%k==0){
                num/=k;
                System.out.println(k);
            }else{
                k++;
            }
        }
        if(num!=1){
            System.out.println(num);
        }
    }
}
