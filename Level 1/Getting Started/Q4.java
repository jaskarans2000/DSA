// Print all Prime Numbers till N
// Question Statement: 
// 1. You've to print all prime numbers between a range. 
// 2. Take as input "low", the lower limit of range.
// 3. Take as input "high", the higher limit of range.
// 4. For the range print all the primes numbers between low and high (both included).

// Note: Optimised solution is to sieve of eratosthenes if low=0 and high is small
// Otherwise use segmented sieve

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();
        // naive(low,high);
        segmentedSieve(low,high);
    }

    static void segmentedSieve(int low, int high){
        // Find all prime numbers 0->sqrt(high)
        ArrayList<Integer> primeNumbers=getPrimes((int)Math.pow(high,0.5));
        // Create an array of size high-low+1 where 0 index represent low
        boolean[] newArray=new boolean[high-low+1];
        Arrays.fill(newArray, true);
        // mark all the multiples of primes found in step1 in array created in step2
        for(int i=0;i<newArray.length;i++){
            int indexNumber=low+i;
            for(int j: primeNumbers){
                if(indexNumber%j==0 && indexNumber!=j){
                    newArray[i]=false;
                    break;
                }
            }
            if(newArray[i]){
                System.out.println(indexNumber);
            }
        }
    }

    static ArrayList<Integer> getPrimes(int num){
        boolean[] primes=new boolean[num+1];
        Arrays.fill(primes, true);
        for(int i=2;i*i<=num;i++){
            for(int j=i*i;j<=num;j+=i){
                primes[j]=false;
            }
        }
        ArrayList<Integer> primeNumbers=new ArrayList<>();
        for(int i=2;i<=num;i++){
            if(primes[i]){
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
    }

    static void naive(int low, int high){
        for(int i=low; i <= high; i++){
            boolean flag=isPrime(i);
            if(flag){
                System.out.println(i);
            }
        }
    }

    static boolean isPrime(int num){
        boolean isPrime=true;
        for(int j=2; j*j<=num; j++){
            if(num%j == 0){
                isPrime=false;
                break;
            }
        }
        return isPrime;
    }
}

