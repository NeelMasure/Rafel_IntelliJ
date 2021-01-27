package Day9;

public class ArraysMethods {

    public static void main(String[] args) {
        ArraysMethods am = new ArraysMethods();

        am.studentDetails("Neel","Pune","Chichwad");
        am.studentDetails("Neel","Pune");


    }

    public void studentDetails(String name ,String city){
        System.out.println("Student name"+name);
        System.out.println("Student City"+city);
    }

    public void studentDetails(String...pram){
        System.out.println("Student details"+pram);

    }

}
