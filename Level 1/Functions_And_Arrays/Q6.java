// Q. Any base subtraction (n2-n1)


package Functions_And_Arrays;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int base=scn.nextInt();
        int num1=scn.nextInt();
        int num2=scn.nextInt();
        System.out.println(anyBaseSubtraction(base,num1,num2));
    }

    public static int anyBaseSubtraction(int base,int num1,int num2){
        int res=0,carry=0,mul=1;
        while(num1>0 || carry>0){
            int rem1=num1%10;
            int rem2=num2%10;
            int resRem=(rem2-rem1-carry);
            if(resRem<0){
                resRem+=base;
                carry=1;
            }else{
                carry=0;
            }
            res+=resRem*mul;
            mul*=10;
            num1/=10;
            num2/=10;
        }
        return res;
    }
}
