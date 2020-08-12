package Day3;

import Day4.Collage;

//Child class ---Parent class
public class StudentUnion extends Collage{

    public static void main(String[] args) {

        Collage col = new Collage();
        col.admission();


        StudentUnion su = new StudentUnion();
        su.arts();
        su.demo();


    }

    public void demo(){
        System.out.println("Demo");

    }

}
