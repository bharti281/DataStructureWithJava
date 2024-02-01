package Apna_College;

import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int x = sc.nextInt();
        if(x % 2 == 0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
}
