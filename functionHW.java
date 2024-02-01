package Apna_College;

import java.util.Scanner;

public class functionHW {
    public  static void checkEven(int no){
        if(no%2==0){
            System.out.println("This no is even");
        }
        else {
            System.out.println("This no is odd");
        }
    }
    public static  void printTable(int no){
        for(int i=1;i<=10;i++){
            System.out.println(no +" X " +i +" = "+ no*i);
        }
    }
    public  static void printPrimeNo(int no){
        boolean isPrime = true;
        for(int i=2; i<=no/2; i++){
            if(no%i == 0){
                isPrime =false;
                break;
            }
        }
        if(isPrime){
            if( no==1){
                System.out.println("This is neither prime no composite");
            }
            else{
                System.out.println("This is a prime no");
            }

        }
        else {
            System.out.println("This is not a prime no");
        }

    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int no = Sc.nextInt();
//        printPrimeNo(no);
        checkEven(no);
        printTable(no);

    }
}
