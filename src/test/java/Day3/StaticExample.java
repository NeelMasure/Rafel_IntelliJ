package Day3;

public class StaticExample {

   static String city = "Bombay";
   static int age;


    public static void main(String[] args) {

        System.out.println(city);
        city= "Bangalore";
        System.out.println(city);
        city= "London";
        System.out.println(city);
        System.out.println(age);
        age = 25;
        System.out.println(age);
        Student(52);
        StaticExample se =new StaticExample();
        se.collage();
    }

    public static void Student(){
        System.out.println("Student age "+age);
        System.out.println(city);

    }

    public static void Student(int age){
        System.out.println("Student age "+age);
        System.out.println(city);

    }

    public void collage(){
        System.out.println(city);


    }

}
