package _10_HashMap;

import java.util.HashMap;

public class _2 {
    public static void main(String[] args) {
/*
map in uzunlugu
 */

        HashMap<String,String> map = new HashMap<>();


        map.put("Amazon",        "296 Euro");
        map.put("Ebay",              "278 Euro");
        map.put("Saturn",            "300 Euro");
        map.put("MediaMarkt" ,"310 Euro");
        map.put("Apple Store",   "340 Euro");


        System.out.println("Map'in boyutu:   " + map.size());
    }
}
