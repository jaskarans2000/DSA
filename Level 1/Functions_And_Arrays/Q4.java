// Q. Any base to any base

package Functions_And_Arrays;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();
        int base1=scn.nextInt();
        int base2=scn.nextInt();
        int decimal=anyBaseToDecimal(num, base1);
        System.out.println(decimalToAnyBase(decimal, base2));
    }

    public static int anyBaseToDecimal(int num,int base){
        int res=0,mul=1;
        while(num>0){
            int rem=num%10;
            res=res+rem*mul;
            mul*=base;
            num/=10;
        }
        return res;
    }

    public static int decimalToAnyBase(int num,int base){
        int res=0,mul=1;
        while(num>0){
            int rem=num%base;
            res+=rem*mul;
            num/=base;
            mul*=10;
        }
        return res;
    }
}
