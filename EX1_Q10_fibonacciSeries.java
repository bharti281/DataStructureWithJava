package Apna_College;

import java.util.Scanner;

public class EX1_Q10_fibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = sc.nextInt();
        int firstTerm=0 , secondTerm = 1;

        for(int i=1; i<=n; ++i){

            System.out.println(firstTerm);
            int nextTerm = firstTerm+secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

    }
}
