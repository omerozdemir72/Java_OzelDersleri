package _10_HashMap;

import java.util.HashMap;

public class _10 {
    public static void main(String[] args) {

        /*

      Bir hashmap oluşturun. Key -Integet
      Value - Integer

     1,   10
     2,   20
     3,   30
     4,   40


     Eğer key lerin içerisinde 3 varsa
     konsola 3'ün DEĞERİNİ yazdırın.

         */
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(1,10);
        map.put(2,20);
        map.put(3,30);
        map.put(4,40);

        if(map.containsKey(4))
        System.out.println(map.get(2));

    }
}
