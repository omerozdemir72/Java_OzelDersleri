package _7_ArrayList_Ve_GecmisKonular_Tekrar;

import java.util.ArrayList;
import java.util.Collections;

public class _2 {
    public static void main(String[] args) {
        /*
        String arrayLst oluşturun ve
        Binali
        Tayyip
        Mansur
        Ekrem
        Elemanlarını gönderin.Daha sonra bunları sıraya sokun ve yazdırın.
         */

        ArrayList<String>arrayList = new ArrayList<>();
        arrayList.add("Binali");
        arrayList.add("Tayyip");
        arrayList.add("Mansur");
        arrayList.add("Ekrem");
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
}
