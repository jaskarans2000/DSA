// Rotate a number
// Question Statement: 
// 1. You are given two numbers n and k. You are required to rotate n, k times to the right. If k is positive, rotate to the right i.e. remove rightmost digit and make it leftmost. Do the reverse for negative value of k. Also k can have an absolute value larger than number of digits in n.
// 2. Take as input n and k.
// 3. Print the rotated number.
// 4. Note - Assume that the number of rotations will not cause leading 0's in the result. e.g. such an input will not be given
//    n = 12340056
//    k = 3
//    r = 05612340
// 12345
// k=1 51234  k=-1 23451
// k=2 45123  k=-2 34512
// k=3 34512  k=-3 45123
// k=4 23451  k=-4 51234
// k=5 12345  k=-5 12345

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k= scn.nextInt();
        int rotatedNumber=rotateNumber(n,k);
        System.out.println(rotatedNumber);
    }
    public static int rotateNumber(int n, int k){
        int cod= countDigits(n);
        k=k%cod;
        if(k<0){
            k=cod+k;
        }
        int div=(int)Math.pow(10, k);
        int rem= n%div;
        n=n/div;
        return rem*((int)Math.pow(10,cod-k))+n;
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
