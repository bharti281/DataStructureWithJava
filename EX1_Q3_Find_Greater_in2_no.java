package Apna_College;

import java.util.Scanner;

public class EX1_Q3_Find_Greater_in2_no {
    public static  void findGreater(int a , int b){
        if(a>b){
            System.out.println(a + " is greater");
        }
      else if(b>a){
            System.out.println(b+ " is greater");
        }
        else {
            System.out.println("both are equal");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.println("Enter first no");
        int a = sc.nextInt();
        System.out.println("Enter second no");
        int b = sc.nextInt();
        findGreater(a , b);



    }
}
