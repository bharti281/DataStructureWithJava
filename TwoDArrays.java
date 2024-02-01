package Apna_College;

import java.util.Scanner;

public class TwoDArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of no of rows and cols");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int [] [] numbers = new int[rows][cols];
        System.out.println("Enter values of matrix");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                numbers[i][j]= sc.nextInt();
            }
        }

        for(int i=0; i<rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(numbers[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.println("Enter the number for search");
        int no = sc.nextInt();
        //Liner serach in 2D Array
        for(int i=0; i<rows; i++) {
            for (int j = 0; j < cols; j++) {
               if(numbers[i][j] == no){
                   System.out.println(no+" number found at location ["+i+"] ["+j+"]");
               }
            }

        }

    }
}
