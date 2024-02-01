package Apna_College;

import java.util.Scanner;

public class EX1_Q8_Find_power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int x =  sc.nextInt();
        System.out.println("Enter second number");
        int n =  sc.nextInt();
        int pow=1;
        for(int i=1; i<=n; i++){
             pow = pow*x;
        }

        System.out.println("The power of "+x+ " of"+n +" = "+ pow);
    }
}
