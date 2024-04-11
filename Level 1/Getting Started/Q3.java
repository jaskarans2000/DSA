// Note: If we use nextInt() then nextLine() it will skip nextLine() but if we reverse the order it will work
// Is Prime - Check whether the number is prime or not
// I/P -> Number of test cases, question number t times
// O/p -> prime, not prime
// ** A prime number is any number that can only be divided by 1 and number itself
// Question Statement: 
// 1. You've to check whether a given number is prime or not.
// 2. Take a number "t" as input representing count of input numbers to be tested.
// 3. Take a number "n" as input "t" number of times.
// 4. For each input value of n, print "prime" if the number is prime and "not prime" otherwise.

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int t = scn.nextInt();
        for(int i=0; i < t; i++){
            int num = scn.nextInt();
            boolean isPrime=true;
            for(int j=2; j*j<=num; j++){
                if(num%j == 0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.println("prime");
            }else{
                System.out.println("not prime");
            }
        }
    }
}
