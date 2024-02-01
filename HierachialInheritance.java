package Apna_College;
// This is the eaxample of Hierachical Inhariance
class LivingThings{
    int eyes = 2;
    int nose =1;

    public  void breath(){
        System.out.println("Breathing........... ........ .....");
    }
    public  void walking(){
        System.out.println("walking..... ..... .....");
    }

}
class Human extends LivingThings{
    int leg = 2;
}

class Animal extends LivingThings{
    int leg = 4;
}
public class HierachialInheritance {
    public static void main(String[] args) {
        Human human  = new Human();
        human.breath();
        human.walking();
        Animal animal = new Animal();
        animal.breath();;
        animal.walking();


    }
}
