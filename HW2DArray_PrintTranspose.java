package Apna_College;

import java.util.Scanner;

public class HW2DArray_PrintTranspose {
    public static void main(String[] args) {
        System.out.println("Enter the size of rows and cols");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int [][]array = new int[rows][cols];
        System.out.println("Enter the values of matrix");
        for(int j=0 ;j<rows; j++){
            for (int i=0; i<cols; i++){
                array[i][j]= sc.nextInt();
            }
        }

        System.out.println("The transpose is : ");
        for (int i=0; i<cols; i++){
            for(int j=0 ;j<rows; j++) {
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }



    }
}
