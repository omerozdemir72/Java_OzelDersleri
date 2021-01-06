package _10_HashMap;

import java.util.HashMap;

public class _5 {

    public static void main(String[] args) {
/*
Hashmap'in elemanlarını TAMAMEN silme, boşaltma
 */
        HashMap<Integer,String> map = new HashMap<>();

        map.put(1,"Omer");
        map.put(2,"Huseyin");
        map.put(3,"Ahmet");
        map.put(4,"Meral");
        map.put(5,"Tufan");

        System.out.println("önceki hali :   " +map);
      map.clear();
        System.out.println("clear methodunda sonra :   " + map);

        System.out.println(map.isEmpty()); //map boş mu ? boş ise true

    }
}
