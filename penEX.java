package Apna_College;


 class pen{
    String color;
    String type;
    public void write(){
        System.out.println("Writing Something");
    }
    public void printColor()
    {
        System.out.println(this.type +" is color "+this.color);
    }
}
class Student {
    String name;
    int age;

    Student() {
        System.out.println("Constructor called");
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printName() {
        System.out.println(this.name + " is " + this.age + " old .");
    }

    //  copy  Constructor
    Student(Student Bharti) {
        this.name = Bharti.name;
        this.age = Bharti.age;
    }
}
public class penEX {
    public static void main(String[] args) {
     pen pen1 = new pen();
     pen1.color = "blue";
     pen1.type ="boll pen";
//     pen1.write();
//     pen1.printColor();

     pen pen2 = new pen();
     pen2.color = "Black";
     pen2.type = "Jel pen";
//     pen2.printColor();

        Student Bharti =  new Student("Bharti",91);
//        Bharti.name = "Bharti";
//        Bharti.age = 91;
//        Bharti.printName();

        Student B1 = new Student(Bharti);
        B1.printName();

    }
 }
