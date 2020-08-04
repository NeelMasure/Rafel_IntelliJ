package day2;

public class StringExample2 {

    public static void main(String[] args) {

        String name = "Neel#545625412";

        System.out.println(name.split("#")[0].substring(2));
        System.out.println(name.split("#")[1]);
        System.out.println(name.substring(2,6));



    }
}
