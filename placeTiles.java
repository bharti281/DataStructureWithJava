package Apna_College;

public class placeTiles {
    public  static  int placedTiles(int n ,int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        int verticalPlacement = placedTiles(n-m,m);
        int HorizontalPlacement = placedTiles(n-1,m);
        return verticalPlacement+HorizontalPlacement;
    }
    public static void main(String[] args) {
        System.out.println(placedTiles(4,2));
    }
}
