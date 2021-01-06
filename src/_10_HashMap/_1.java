package _10_HashMap;

import java.util.HashMap;

public class _1 {
    public static void main(String[] args) {

        /*
        HashMap
         */


        HashMap<String,String> map = new HashMap<>();

        //Ekleme işlemi için;   map.put();

        map.put("Amazon","296 Euro");
        map.put("Ebay","278 Euro");
        map.put("Saturn","300 Euro");
        map.put("MediaMarkt","310 Euro");
        map.put("Apple Store","340 Euro");


        System.out.println(map);


    }
}
