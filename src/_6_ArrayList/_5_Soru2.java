package _6_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class _5_Soru2 {
    public static void main(String[] args) {

        /*
        Integer arraylist oluşturun. ismi sayi olsun.
        10
        30
        20
        55
        12
        3
        Bu arrayilistin elemanlarını "sıraya dizin" .

        ve  20'nin indexini alın ve konsola yazdırın.
         */

        ArrayList<Integer> list= new ArrayList<>();
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(55);
        list.add(12);
        list.add(3);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);


        System.out.println(list.indexOf(20)); //20 nin indexini ver



    }
}
