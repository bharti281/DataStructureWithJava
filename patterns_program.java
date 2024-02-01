package Apna_College;

public class patterns_program {
    public static void main(String[] args) {
//        Q1 Solid rectangle
//        * * * * *
//        * * * * *
//        * * * * *
//        * * * * *

//        int n = 4;
//        int m = 5;
//        for (int i = 1;i<=n; i++){
//            for(int  j= 1;j<=m;j++){
//                System.out.print(" * ");
//
//            }
//            System.out.println();
//        }


//        Q2 Hollow Rectangle
//        * * * * *
//        *       *
//        *       *
//        * * * * *
//

//        int n = 4;
//        int m = 5;
//        for(int i=1;i<=n;i++){
//            for (int j = 1;j<=5;j++){
//                if(i==1||j==1||i==n || j==m){
//                    System.out.print(" * ");
//                }
//                else{
//                    System.out.print("   ");
//                }
//            }
//            System.out.println(" ");
//        }

//        Half  Pyramid
//         *
//         * *
//         * * *
//         * * * *
//
//        int n =4;
//        for(int i =1 ;i<=n;i++ ){
//            for(int j = 1 ;j<=i;j++){
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }

//        Inverted Half Pyramid
//        * * * *
//        * * *
//        * *
//        *

//int n = 4;
//for (int i = n;i>=1;i--){
//    for(int j = 1;j<=i;j++){
//        System.out.print(" * ");
//    }
//    System.out.println();
//}


//        Inverted Half Pyramid rotated by 180deg
//            *
//          * *
//        * * *
//      * * * *

//int n = 4;
//for(int i = 1; i<=n; i++){
////    inner loop for space
//    for(int j=1;j<=n-i;j++){
//        System.out.print("   ");
//    }
//    for (int j=1;j<=i;j++){
//        System.out.print(" * ");
//    }
//    System.out.println();
//}

        //        Half  Pyramid with number
//         1
//         1 2
//         1 2 3
//         1 2 3 4
//

//        int n= 5;
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=i; j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }


        //        Inverted Half Pyramid with number
//        1 2 3 4 5
//        1 2 3 4
//        1 2 3
//        1 2
//        1

//        int  n = 5;
//        for(int i=1; i<=n; i++){
//            for (int j=1; j<=n-i+1 ; j++){
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }

//        second method to print this pattern
//        int n = 5;
//        for (int i = n ; i>=1 ; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }

//        floyd's triangle
//        1
//        2 3
//        4  5  6
//        7  8   9  10
//        11  12  13  14 15
//
//        int n = 5;
//        int no =1;
//        for(int i=1; i<=n; i++){
//            for(int j = 1; j<=i; j++){
//                System.out.print(no+" ");
//                no++;
//            }
//            System.out.println();
//        }


//        0-1 triangle
//        1
//        0 1
//        1 0 1
//        0 1 0 1
//        1 0 1 0 1

//int n = 5;
//for (int i = 1; i<=n; i++){
//    for(int j =1; j<=i; j++){
//        int sum  = i+j;
//        if(sum%2 == 0){
//            System.out.print(1+ " ");
//        }
//        else {
//            System.out.print(0 + " ");
//        }
//
//    }
//    System.out.println();
//}


    }
}
