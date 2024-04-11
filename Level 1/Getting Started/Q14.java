// Benjamin Bulbs
// Question Statement: 
// 1. You are given n number of bulbs. They are all switched off. A weird fluctuation in voltage hits the circuit n times. In the 1st fluctuation all bulbs are toggled, in the 2nd fluctuation every 2nd bulb is toggled, in the 3rd fluctuation every 3rd bulb is toggled and so on. You've to find which bulbs will be switched on after n fluctuations.
// 2. Take as input a number n, representing the number of bulbs.
// 3. Print all the bulbs that will be on after the nth fluctuation in voltage.
// 36-> 1*36, 2*18, 3*12, 4*9, 6*6, 9*4, 12*3, 18*2, 36*1 odd number of times fluctuation hits so will change state

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();
        int k=1;
        while(k*k<=num){
            System.out.println(k*k);
            k++;
        }
    }
}
