package Apna_College;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner  sc =new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.println("Enter 1 for Addition  2 for Subtraction 3 for Multiplication 4 for division 5 for modulo");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4 :
                System.out.println(a/b);
                break;
            case 5:
                System.out.println(a%b);
                break;
            default:
                System.out.println("Invalid input");

        }
    }
}
