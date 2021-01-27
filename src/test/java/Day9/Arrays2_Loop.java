package Day9;

public class Arrays2_Loop {

    public static void main(String[] args) {


        String[] std = {"Neel","Bhargav" , "Vishal","Ashish","Sarfaraz","Shrikant"};

        for (String str : std){
            if (str.equals("Neel")){
                System.out.println("Match");
                break;
            }else{
                System.out.println("Not Match");

            }
        }

    }






}
