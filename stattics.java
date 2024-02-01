package Apna_College;

class Students1{
    String name ;
   static String school;
   public  static  void changeSchool(){
    school = "newSchool";
   }
}
public class stattics {
    public static void main(String[] args) {
        Students1.school = "jmv";
        Students1 students1 = new Students1();
        students1.name = "Bharti";
        System.out.println(students1.school);


    }
}
