package Day9;

import java.util.ArrayList;
import java.util.List;

public class Array_List {

    public static void main(String[] args) {

        String[] std = new String[3];
        std[0] = "Neel";

        ArrayList<String> ar = new ArrayList<String>();
        ar.add("Bhargav");
        ar.add("Vishal");
        ar.add("Ashish");
        ar.add(0, "Medha");

        ArrayList<String> course = new ArrayList<>();
        course.add("Java");
        course.add("Python");
        course.add("Appium");
        course.addAll(ar);

        System.out.println("Total Value " + course.size());

//        System.out.println(course.get(5));

        for (int i = 0; i < course.size(); i++) {
            System.out.println(course.get(i));
        }
    }

}
