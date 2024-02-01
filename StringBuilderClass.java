package Apna_College;

public class StringBuilderClass {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Bharti");
        System.out.println(sb);

        System.out.println(sb.charAt(0));

        sb.setCharAt(0,'A');
        System.out.println(sb);

        sb.insert(0,'R');
        System.out.println(sb);

        sb.insert(2,'R');
        System.out.println(sb);

        sb.delete(4,8);
        System.out.println(sb);


        StringBuilder str = new StringBuilder("h");
        str.append("e");
        str.append("l");
        str.append("l");
        str.append("o");
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.reverse());





    }
}
