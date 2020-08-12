package Day3;

public class Courses {

// Default Construstor
    Courses(){
        System.out.println(" I am Default construstor");


    }
// Parametor Constructor
    Courses(String name,String Sub, int roll){
        System.out.println(" I am Default construstor");
        System.out.println("Student name"+name);
        System.out.println("Student opted sub "+Sub);
        System.out.println("Student roll"+roll);
        System.out.println("********************");

    }


    public static void main(String[] args) {
        Courses  c = new Courses("Neel","Java",505);
        new Courses("Bhargav", "Appium", 606);

        c.course("Neel");



    }




//    Method
    void  course(String name){
        System.out.println("Student name"+name);


    }


}
