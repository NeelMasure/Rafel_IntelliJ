package Day9;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {

        Set<String> set =new HashSet<>();
        set.add("Neel");
        set.add("Neel");
        set.add("Bhargav");
        set.add("Vishal");

        System.out.println(set.size());
        for(String ref: set){
            System.out.println(ref);
        }
        Iterator<String>st= set.iterator();
        while (st.hasNext()){
            System.out.println(st.next());
        }
    }
}
