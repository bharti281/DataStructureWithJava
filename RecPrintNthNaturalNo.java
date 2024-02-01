package Apna_College;

public class RecPrintNthNaturalNo {
    public  static  void PrintNNaturealNo(int i,int n,int sum){
        if(i==n)
        {
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
      PrintNNaturealNo(i+1,n,sum);
    }
    public static void main(String[] args) {
        PrintNNaturealNo(1,5,0);
    }
}
