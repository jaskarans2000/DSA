// Q Decimal to any base


package Functions_And_Arrays;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();
        int base=scn.nextInt();
        System.out.println(decimalToAnyBase(num,base));
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
