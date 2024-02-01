package Apna_College;

interface  Animals1{
    //This property always public static and final
    int eye = 2;
    void walk();
    void eat();
}
interface  Herbivore{
    void eats();
}
class Horses1 implements  Animals1 ,Herbivore{
    public  void walk (){
        System.out.println("Walks on 4 legs");
    }
    public  void eat(){
        System.out.println("Animal eats");
    }

    @Override
    public void eats() {
        System.out.println("only eat grass");
    }
}
public class interfaces {
    public static void main(String[] args) {

    }
}
