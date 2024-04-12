// Q. Digit Frequency
// I/p -> number, Digit
// o/p -> number of times digit appears in number
// Example:  number: 123345 digit: 3 o/p -> 2


package Functions_And_Arrays;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();
        int digit=scn.nextInt();
        System.out.println(countDigits(num,digit));
    }

    public static int countDigits(int num,int digit){
        int count=0;
        while(num>0){
            int rem=num%10;
            if(rem==digit){
                count++;
            }
            num/=10;
        }
        return count;
    }
}
