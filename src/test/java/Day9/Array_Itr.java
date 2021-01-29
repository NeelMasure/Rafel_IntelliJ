package Day9;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_Itr {

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

        Iterator<String> it= course.iterator();
        System.out.println(it.hasNext());

        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("Out of loop");

        }

        }


