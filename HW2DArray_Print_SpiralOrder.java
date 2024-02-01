package Apna_College;

import java.util.Scanner;

public class HW2DArray_Print_SpiralOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of rows and cols");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the value");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("The spiral order matrix is :");
        int rowStart = 0;
        int rowEnd = rows-1;
        int colStart = 0;
        int colEnd = cols-1;

//        To print spiral order matrix
        while (rowStart<=rowEnd && colStart<=colEnd){
            for(int col=colStart; col<=colEnd; col++){
                System.out.print(matrix[rowStart][col]+" ");
            }
            rowStart++;
            for(int row = rowStart; row<=rowEnd; row++){
                System.out.print(matrix[row][colEnd]+" ");
            }
            colEnd--;
            for(int col = colEnd; col>=colStart;col--){
                System.out.print(matrix[rowEnd][col]+" ");
            }
            rowEnd--;
            for (int row = rowEnd; row>=rowStart; row--){
                System.out.print(matrix[row][colStart]+" ");
            }
            colStart++;


        }
        System.out.println();
    }

}
