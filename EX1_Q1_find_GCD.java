package Apna_College;
import java.util.Scanner;

public class EX1_Q1_find_GCD {
    public  static  void GCD(int num1 , int num2) {
        int gcd = 1;
        for (int i = 1; i <= num1 && i <= num2; ++i) {
          if(num1%i == 0 && num2 % i==0){
             gcd = i;
          }

        }
        System.out.println("GCD of "+num1+" and "+ num2+" is " +gcd);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();
        GCD( num1 , num2);


    }
}
