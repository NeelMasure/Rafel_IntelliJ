package Day9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Array_List_Itr {

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

        ListIterator<String> liIt = course.listIterator();
        while (liIt.hasNext()) {

            System.out.println(liIt.next());
        }
        System.out.println("=================");

        while (liIt.hasPrevious()) {
            System.out.println(liIt.previous());
        }

    }
}


