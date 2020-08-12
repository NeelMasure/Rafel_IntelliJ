package day2;

public class ForEachLoop {

    public static void main(String[] args) {

        String s1 = "Neel";
        String s2 = "Bhargav";
        String s3 = "Vishal";

        String st[] = {"Neel, Bhargav , Vishal"};

        for (int i=0;i<st.length;i++){
            System.out.println(st[i]);
        }

        System.out.println("*************");
//This is called for each loop
        for(String str : st){
            if (str.equals("Neel")) {
                System.out.println("Match"+str);
            }else {
                System.out.println("Not Match"+str);
            }


            System.out.println(str);
        }

    }



}
