package Day9;

import java.util.*;

public class HashMap_HashTable {


    public static void main(String[] args) {


        HashMap mp = new HashMap();
        mp.put("Name", "Neel");
        mp.put("City", "Pune");
        mp.put("Pincode", "411033");
        mp.put(null,null);

        System.out.println(mp);

        Hashtable <String,String> t = new Hashtable<String,String>();
        t.put("Name", "Neel");
        t.put("City", "Pune");
        t.put("Pincode", "411033");
        t.put(null,null);

        System.out.println(t);





//        for (Map.Entry ref : mp.entrySet()) {
//            System.out.println(ref);
        }
    }


