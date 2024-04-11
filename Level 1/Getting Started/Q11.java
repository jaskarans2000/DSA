// GCD and LCM
// Question Statement: 
// 1. You are required to print the Greatest Common Divisor (GCD) of two numbers. 
// 2. You are also required to print the Lowest Common Multiple (LCM) of the same numbers. 
// 3. Take input "num1" and "num2" as the two numbers. 
// 4. Print their GCD and LCM.
// Note: gcd*lcm=num1*num2
// To find GCD
// 1) Divide num1 by num2 if remainder not 0 replace num1 with num2 and num2 with remainder
// 2) Repeat this step till remainder is 0 then num2 is gcd

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int num1=scn.nextInt();
        int num2=scn.nextInt();
        // int gcd=findGCD(num1,num2);
        // int lcm=num1*num2/gcd;
        int lcm=findLCM(num1, num2);
        int gcd=num1*num2/lcm;
        System.out.println("GCD: "+gcd+" LCM: "+lcm);
    }

    static int findGCD(int num1,int num2){
        int gcd=1;
        while(num1%num2!=0){
            gcd=num1%num2;
            num1=num2;
            num2=gcd;
        }
        return gcd;
    }

    static int findLCM(int num1,int num2){
        int lcm=num1;
        if(num2>num1){
            lcm=num2;
        }
        int count=2;
        while(lcm%num1!=0 || lcm%num2!=0){
            lcm*=count;
            count++;
        }
        return lcm;
    }
}
