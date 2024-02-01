package Apna_College;

abstract class Animals {
    Animals(){
        System.out.println("You are a animal");
    }
   abstract public  void walk();
   public  void eats(){
       System.out.println("Animal eats");
   }
}
class Horse extends  Animals{
    Horse(){
        System.out.println("Horse constructor");
    }
    public  void walk (){
        System.out.println("Walks on 4 legs");
    }
}
class chicken extends  Animals{
    public  void walk (){
        System.out.println("Walks on 4 legs");
    }
}




public class AbtractionClass {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        horse.eats();
    }

}
