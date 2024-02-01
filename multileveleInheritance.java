package Apna_College;

class Shapes{
    String color;
    public  void area(){
        System.out.println("Display area");
    }

}
class Triangles extends  Shapes{
    public  void area(int l , int h){
        System.out.println("Area = " + (1/2)*l*h);
    }
}
class  EquilateralTriangle extends  Triangles
{
    public  void areas(int l , int h)
    {
        System.out.println( 1/2*l*h);
    }
    public void add(int a, int b){
        System.out.println(a+b);
    }
}


public class multileveleInheritance {
    public static void main(String[] args) {
        EquilateralTriangle Et =  new EquilateralTriangle();
        Et.areas(12,87);
        Et.add(12,87);

    }
}
