package Apna_College;

public class invertedNumberPattern {
    public static void main(String[] args) {
        int n=4;
        for(int i=n; i>=1; i--){
            for(int j=1 ; j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i; j++)
            {
               int sum = n-i+1;
                System.out.print(sum+" ");
            }
            System.out.println();

        }


    }
}
