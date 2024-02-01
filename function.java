package Apna_College;

import java.util.Scanner;

public class function {
public  static void printMyName(String name){
    System.out.println(name);

}
public  static  int sum(int a,int b){
    int sum = a+b;
    return sum;
}
public static int  mul(int a,int b){
    return a*b;
}


    public static void main(String[] args) {
//        function is a block of code
        Scanner sc = new Scanner(System.in);
//        String name = sc.next();
//        printMyName(name);
        int a = sc.nextInt();
        int b = sc.nextInt();
//        int sum = sum(a,b);
//        System.out.println("Sum of 2 no is "+sum);
        System.out.println("product of 2 no is "+ mul(a,b));
    }
}
