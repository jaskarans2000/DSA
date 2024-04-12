// Q. Any base multiplication


package Functions_And_Arrays;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int base=scn.nextInt();
        int num1=scn.nextInt();
        int num2=scn.nextInt();
        System.out.println(anyBaseMultiplication(base,num1,num2));
    }

    public static int anyBaseMultiplication(int base,int num1,int num2){
        int res=0,mul=1;
        while(num2>0){
            int rem=num2%10;
            int remMultiplication=getMultiplyWithDigit(base,num1,rem);
            res=anyBaseAddition(base, res,remMultiplication*mul);
            mul*=10;
            num2/=10;
        }
        return res;
    }

    public static int anyBaseAddition(int base, int num1,int num2){
        int res=0,carry=0,mul=1;
        while(num1>0 || num2>0 || carry>0){
            int rem1=num1%10;
            int rem2=num2%10;
            res+=(((rem1+rem2+carry)%base)*mul);
            carry=(rem1+rem2)/base;
            mul*=10;
            num1/=10;
            num2/=10;
        }
        return res;
    }

    public static int getMultiplyWithDigit(int base,int num,int dig){
        int res=0,carry=0,mul=1;
        while(num>0 || carry>0){
            int rem=num%10;
            int tempRes=dig*rem+carry;
            res+=(tempRes%base)*mul;
            carry=(tempRes/base);
            mul*=10;
            num/=10;
        }
        return res;
    }
}
