package _10_HashMap;

import java.util.HashMap;

public class _6 {

    public static void main(String[] args) {
/*
map.containsKey
 */

        HashMap<String,String> map = new HashMap<>();
                    //key                       value
        map.put("Amazon","296 Euro");
        map.put("Ebay","278 Euro");
        map.put("Saturn","300 Euro");
        map.put("MediaMarkt","310 Euro");
        map.put("Apple Store","340 Euro");


        String key = "Apple Store";

        if (map.containsKey("Apple Store")){ //eğer map in içerisinde apple store isminde bir key var ise,
            System.out.println("Değeri :   " + map.get(key)); // değerini yazdırma
        }else
            System.out.println("Bu map içerisinde bununla alakalı bir veri yoktur.");


    }
}
