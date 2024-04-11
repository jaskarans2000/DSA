// Count Digits in a Number
// Question Statement: 
// 1. You've to count the number of digits in a number.
// 2. Take as input "n", the number for which the digits has to be counted.
// 3. Print the digits in that number.

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int count=0;
        while(n>0){
            count++;
            n/=10;
        }
        System.out.println(count);
    }
}
