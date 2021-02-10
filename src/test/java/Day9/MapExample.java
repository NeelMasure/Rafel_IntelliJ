package Day9;

import java.util.HashMap;
import java.util.Map;

public class MapExample {


    public static void main(String[] args) {

        Map<String, String> mp = new HashMap<String, String>();
        mp.put("Name", "Neel");
        mp.put("City", "Pune");
        mp.put("Pincode", "411033");
        System.out.println(mp.get("Name"));
        mp.put("Country", "India");

        System.out.println("Pin");

        for (Map.Entry ref : mp.entrySet()) {
            System.out.println(ref.getKey()+"_____"+ref.getValue());
        }
    }

}

