package Apna_College;

import java.util.Scanner;

public class Check_primeno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int flag =0;
        int no = sc.nextInt();
        for(int i=2; i<no/2; i++){
            if(no%i == 0){
                flag =1;
                break;
            }
        }
        if(flag==1){
            System.out.println("This is not prime no");
        }
        else {
            System.out.println("This is a prime no");
        }
    }
}
