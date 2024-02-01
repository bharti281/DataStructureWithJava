package Apna_College;

public class calculatePower {

    public  static  int calcPower(int x ,int n){
        if(n==0){
            return 1;
        }
        if(x== 0){
            return  0;
        }
     int xPownm1 =   calcPower(x ,n-1);
     int xPown = x* xPownm1;
     return  xPown;
    }

//    print x to the power of n  and stack height is logn

    public  static  int calcPowerByLogN(int x ,int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        if(n%2 ==0)
        {
         return    calcPowerByLogN( x , n/2) *    calcPowerByLogN( x , n/2);
        }
        else {
           return calcPowerByLogN( x , n/2) *    calcPowerByLogN( x , n/2)*x;
        }
    }
    public static void main(String[] args) {
        int x = 2 , n=5;
//        System.out.println(calcPower(x,n));
        System.out.println(calcPowerByLogN(x,n));
    }
}
