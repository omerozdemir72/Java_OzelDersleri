package _10_HashMap;

import java.util.HashMap;

public class _8 {
    public static void main(String[] args) {

        HashMap<String,String> map = new HashMap<>();
        //key                       value
        map.put("Amazon","296 Euro");
        map.put("Ebay","278 Euro");
        map.put("Saturn","300 Euro");
        map.put("MediaMarkt","310 Euro");
        map.put("Apple Store","340 Euro");


        if (map.containsValue("279 Euro")){
            System.out.println("bu fiyatta bir satıcı bulundu." );
        }
        else
            System.out.println("Böyle bir satıcı yok.");

    }
}
