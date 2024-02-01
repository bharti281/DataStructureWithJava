package Apna_College;

import java.util.Scanner;

public class EX1_Q2_PrintSumOfOddNo {
    public  static  void SumOFNOddNo(int a){
        int sum = 0;
        for(int i=1;i<=a;i++){
            if(i%2 == 0)
            {
                 sum += i;

            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no");
        int a = sc.nextInt();
        SumOFNOddNo(a);

    }
}
