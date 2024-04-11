// Digits of a number
// Question Statement: 
// 1. You've to display the digits of a number.
// 2. Take as input "n", the number for which digits have to be displayed.
// 3. Print the digits of the number line-wise.

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n= scn.nextInt();
        int count=countDigits(n);
        int div=((int)Math.pow(10,count-1));
        for(int i=1;i<=count;i++){
            System.out.println(n/div);
            n=n%div;
            div/=10;
        }
    }
    public static int countDigits(int num){
        int count=0;
        while(num>0){
            count++;
            num/=10;
        }
        return count;
    }
}
