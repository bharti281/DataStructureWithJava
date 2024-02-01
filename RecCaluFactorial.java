package Apna_College;

public class RecCaluFactorial {
    public  static int RecCaluFactorial(int n){
        if(n==1||n==0){
            return 1;
        }
       int fact_Num = RecCaluFactorial(n-1);
      int fact_n = n*fact_Num;
      return  fact_n;
    }
    public static void main(String[] args) {
        System.out.println(  RecCaluFactorial(5));
    }
}
