package Apna_College;

public class HW_patternQuestion {

    static int factorial(int n){
        int f;
        for(f=1; n>1; n--){
            f *=n ;
        }
        return f;
    }
    static int ncr(int n, int r){
        return factorial(n)/(factorial(n-r)* factorial(r));
    }
    public static void main(String[] args) {

//        1
//       1 2
//      1 2 3
//     1 2 3 4
//    1 2 3 4 5

//        int n=5;
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=n-i; j++){
//                System.out.print(" ");
//            }
//            for(int j=1; j<=i; j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

//        print a hollow butterfly
//*      *
//**    **
//* *  * *
//*  **  *
//*  **  *
//* *  * *
//**    **
//*      *

//        int n = 4;
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=i; j++){
//                if(i==1||j==1||j==i){
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//
//            }
//            int space= 2*(n-i);
//            for(int j=1;j<=space;j++){
//                System.out.print(" ");
//            }
//            for(int j=1; j<=i; j++){
//                if(i==1||j==1||j==i){
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//
//            }
//            System.out.println();
//        }
//        for(int i=n; i>=1; i--){
//            for(int j=1; j<=i; j++){
//                if(i==1||j==1||j==i){
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//
//            }
//            int space= 2*(n-i);
//            for(int j=1;j<=space;j++){
//                System.out.print(" ");
//            }
//            for(int j=1; j<=i; j++){
//                if(i==1||j==1||j==i){
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//
//            }
//            System.out.println();
//        }

//       print hollow rhombus
//    *****
//   *   *
//  *   *
// *   *
//*****

//        int n=5;
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=n-i; j++){
//                System.out.print(" ");
//            }
//            for(int j=1; j<=n; j++){
//                if(i==1||j==1||j==n|| i==n){
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//
//            }
//            System.out.println();
//        }

//        print pascal tringale
        System.out.println();
        int n,i,j;
        n=5;
        for(i=0;i<=n;i++){
            for(j=0;j<=n-i;j++){
                System.out.print(" ");
            }
            for(j=0;j<=i;j++){
                System.out.print(" "+ncr(i,j));
            }
            System.out.println();
        }


    }




}
