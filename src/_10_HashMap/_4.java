package _10_HashMap;

import java.util.HashMap;

public class _4 {
    /*
    Ömer
    Hüseyin
    Ahmet
    Meral
    Tufan

    bir hashmap oluşturun. Key kısmına 1,2,3,4,5     value kısmına ise yukarıdaki isimleri sırayla girin.

    Daha sonra bunları konsola yazdırın.
     */

    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();

        map.put(1,"Omer");
        map.put(2,"Huseyin");
        map.put(3,"Ahmet");
        map.put(4,"Meral");
        map.put(5,"Tufan");

        System.out.println(map);

        System.out.println(map.size());

        /*
        map2 oluşturun. ve map teki elemanları map2 ye kopyalayın. ve map2 yi yazdırın.
         */
        HashMap<Integer,String> map2 = new HashMap<>();
        map2.putAll(map);
        System.out.println("map2:  "  +map2);
    }
}
