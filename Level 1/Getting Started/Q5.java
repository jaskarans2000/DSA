// Print all Fibonacci Numbers till N
// Question Statement: 
// 1. You've to print first n fibonacci numbers.
// 2. Take as input "n", the count of fibonacci numbers to print.
// 3. Print first n fibonacci numbers.
// Swapping without extra variable
// a=2,b=3;
// a=2+3=5;
// b=a-b=2;
// a=a-b=3;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a=0,b=1;
        for(int i=0;i<n;i++){
            System.out.println(a);
            int c=a+b;
            a=b;
            b=c;
        }
    }
}
