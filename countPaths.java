package Apna_College;

public class countPaths {
    public  static  int  countPath(int i ,int j, int n ,int m){
        if(i==n||j==n){
            return 0;
        }
        if(i==n-1 && j==m-1){
            return 1;
        }
        int downPath = countPath(i+1 ,j, n , m);
        int rightPath =   countPath(i ,j+1, n , m);
        return  downPath+rightPath;
    }
    public static void main(String[] args) {
        System.out.println(countPath(0,0 ,3,3));
    }
}
