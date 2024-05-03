// Q. Print stair paths

package Recursion_On_The_Way_Up;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        printStairPaths(n,"");
    }
    public static void printStairPaths(int n, String asf){
        if(n==0){
            System.out.println(asf);
            return;
        }
        if(n-1>=0){
            printStairPaths(n-1, asf+'1');
        }
        if(n-2>=0){
            printStairPaths(n-2, asf+'2');
        }
        if(n-3>=0){
            printStairPaths(n-3, asf+'3');
        }
    }
}
