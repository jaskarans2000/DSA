// Q. Any base to decimal


package Functions_And_Arrays;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();
        int base=scn.nextInt();
        System.out.println(anyBaseToDecimal(num,base));
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
}
