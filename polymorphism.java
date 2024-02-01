package Apna_College;
class Students {
    String name ;
    int age ;
    public  void printInfo (String name){
        System.out.println(name);
    }
    public  void printInfo (int age){
        System.out.println(age);
    }
    public  void printInfo (String name,int age){
        System.out.println(name + " is " +age + " old .");
    }

}
public class polymorphism {
    public static void main(String[] args) {
        Students st = new Students();
        st.name = "Bharti";
        st.age = 21;
        st.printInfo(st.age);
        st.printInfo(st.name,st.age);


    }
}
