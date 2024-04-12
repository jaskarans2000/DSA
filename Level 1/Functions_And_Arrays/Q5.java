// Q. Any base addition


package Functions_And_Arrays;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int base=scn.nextInt();
        int num1=scn.nextInt();
        int num2=scn.nextInt();
        System.out.println(anyBaseAddition(base,num1,num2));
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
}
