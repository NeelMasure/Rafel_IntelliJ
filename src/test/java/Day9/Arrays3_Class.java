package Day9;

public class Arrays3_Class {

    public static void main(String[] args) {

        String[] sd = new String[6];

        sd[0]= "Arvind";
        sd[2]="Neel";
        sd[1]="Bhargav";
        sd[3]="Vishal";
        sd[5]="564864";

        /**
         * for (type ref :array){
         * //logic
         *
         */

        for (String ref :sd){
                System.out.println(ref);
        }



    }

}
