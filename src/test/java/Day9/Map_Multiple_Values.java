package Day9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Map_Multiple_Values {


    public static void main(String[] args) {

        /**\
         *
         * A= [Apples,Alphabet,Arizona]
         * B = [Boston,Bulgera]
         *
         */

        ArrayList<String> acity= new ArrayList<>();
        acity.add("Arizona");
        acity.add("Anakapalli");
        acity.add("Amritsar");

        ArrayList<String> bcity= new ArrayList<>();
        bcity.add("Boston");
        bcity.add("Bangalore");
        bcity.add("Bombay");

        Map<String,List<String>> mp = new HashMap<String, List<String>>();
        mp.put("A", acity);
        mp.put("B",bcity);

        for (Map.Entry ref : mp.entrySet()) {
            System.out.println(ref);
        }
    }

}

