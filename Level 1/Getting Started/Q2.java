// Grading System
// I/P -> Marks Of Student
// Marks > 90, --> excellent
// Marks 80 - 90, -->good
// Marks 70 - 80, -->fair
// Marks 60 - 70, -->meets expectation
// Marks <= 60, -->below par

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int marks=scn.nextInt();
        if(marks > 90){
            System.out.println("excellent");
        }else if(marks > 80){
            System.out.println("good");
        }else if(marks > 70){
            System.out.println("fair");
        }else if(marks > 60){
            System.out.println("meets expectation");
        }else{
            System.out.println("below par");
        }
    }
}
