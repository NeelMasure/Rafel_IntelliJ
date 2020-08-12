package Day3;

public class Car {

//Global variable
static String model = "MG2020";

    static int wheel;
    public static void main(String[] args) {
        Car car = new Car();
        car.door(4);
        car.windsheel();
        wheel = 19;
        cc();




    }

//Method or Function
//Access modifier, return type , method name(parameter){body}

public void door(int no){
        //Local Variable
        String colour = "Red";
        System.out.println("My car has "+no+" doors");
    System.out.println("Model of my car is"+ model);


}


//It is a Non static methods
    public void windsheel(){
        System.out.println("Model of my car is " + model);

    }

    public static void cc (){
        System.out.println("Model of my car is " + model);
        System.out.println("Model of my Car CC is "+ 600 );
    }

}

