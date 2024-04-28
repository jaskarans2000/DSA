// Q. Remove primes from arraylist

package String_StringBuilder_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<n;i++){
            al.add(scn.nextInt());
        }
        removePrimes(al);
        System.out.println(al);
    }

    public static void removePrimes(ArrayList<Integer> al){
        int i=al.size()-1;
        while(i>=0){
            int num=al.get(i);
            if(isPrime(num)){
                al.remove(i);
            }
            i--;
        }
    }

    public static boolean isPrime(int num){
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
