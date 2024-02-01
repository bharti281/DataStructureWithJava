package Apna_College;

public class Advanced_Pattern_Question {
    public static void main(String[] args) {
//        Butterfly pattern
//
//*        *
//**      **
//***    ***
//****  ****
//**********
//**********
//****  ****
//***    ***
//**      **
//*        *

//        int n =5;
//        for(int i =1; i<=n; i++){
//            for(int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            int space = 2*(n-i);
//            for(int j=1; j<= space; j++){
//                System.out.print(" ");
//            }
//            for(int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i =n; i>=1; i--){
//            for(int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            int space = 2*(n-i);
//            for(int j=1; j<= space; j++){
//                System.out.print(" ");
//            }
//            for(int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //        Print solid Rhombus
//    ******
//   ******
//  ******
// ******
//******

//        int n = 5;
//        for(int i =1; i<=n; i++){
//            for(int j=1; j<= n-i; j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=n;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }



//        number pyramid
//        1
//       2 2
//      3 3 3
//     4 4 4 4
//    5 5 5 5 5

//       int n=5;
//       for(int i =1; i<=n; i++){
//           for(int j =1;j<=n-i; j++){
//               System.out.print(" ");
//           }
////           print row no ,row no times
//           for(int j=1 ; j<=i; j++){
//               System.out.print(i+" ");
//           }
//           System.out.println();
//       }


//        Palindromic pattern

//        1
//       212
//      32123
//     4321234
//    543212345

//
//        int  n=5;
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for(int j=i; j>=1; j--){
//                System.out.print(j);
//            }
//            for(int j=2;j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }


//        print Dimond pattern
//   *
//  ***
// *****h
//*******
//*******
// *****
//  ***
//   *


        int n= 4;

        for(int i =1; i<=n; i++){
//             loop for space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i =n; i>=1; i--){
//             loop for space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
