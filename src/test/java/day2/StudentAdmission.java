package day2;

public class StudentAdmission {

    public static void main(String[] args) {

        StudentAdmission sa = new StudentAdmission();
        sa.studentDetails();
        sa.studentDetails("Neel",99.95f, "Pune");
        sa.studentDetails("Abhay", 75.56f, "Karnataka");
        float val= sa.average(99.56f, 65.85f,85.65f);
        System.out.println("Average of 3 subjects is" + val);
        System.out.println(Math.round(val));


    }
//Accessmodifier , return type, methodName(PARAMETER)
    public void studentDetails() {
        System.out.println("studentDetails");
    }

//Method over loading

    public void studentDetails(String name, float per, String city){

        System.out.println(name + " is from Pune");
        System.out.println(name+ " has secured " + per + " from Pune University");
        System.out.println(name + " is from" + city);



    }

    public float average(float phy,float che, float mat){
        float avg = (phy+che+mat)/3;
        return avg;
    }

}
