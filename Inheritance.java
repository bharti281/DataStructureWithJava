package Apna_College;

class Shape{
    String color;
    public  void area(){
        System.out.println("Display area");
    }

}
class Triangle extends  Shape{
public  void area(int l , int h){
    System.out.println("Area = " + (1/2)*l*h);
}
}
public class Inheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "red";
    }
}
