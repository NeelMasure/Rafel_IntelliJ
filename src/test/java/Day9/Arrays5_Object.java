package Day9;

public class Arrays5_Object {

    public static void main(String[] args) {

        Object[] sd = new Object[6];

        sd[0]= "Arvind";
        sd[2]=2548;
        sd[1]=5552.65f;
        sd[3]=54554534133435l;
        sd[5]='a';
        sd[4]="Ashish";

        /**
         * for (type ref :array){
         * //logic
         *
         */

        for (Object ref :sd){
                System.out.println(ref);
        }



    }

}
