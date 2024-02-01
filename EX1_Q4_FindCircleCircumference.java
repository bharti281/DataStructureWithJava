package Apna_College;

import java.util.Scanner;

public class EX1_Q4_FindCircleCircumference {
    public  static  double Circumference(int r){
        return 2*Math.PI*r;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle");
        int r = sc.nextInt();
        System.out.println(Circumference(r));
    }
}
