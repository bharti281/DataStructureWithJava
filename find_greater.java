package Apna_College;

import java.util.Scanner;

public class find_greater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a  = sc.nextInt();
        System.out.println("Enter second number");
        int b  = sc.nextInt();
        if(a==b){
            System.out.println("Equal");
        }
        else if(a>b) {
                System.out.println("a is greater");
        }

        else {
                System.out.println("a is lesser");
            }



    }
}
