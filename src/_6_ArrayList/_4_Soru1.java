package _6_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class _4_Soru1 {
    public static void main(String[] args) {

         /* todo SORU 1

String arrayList oluşturun.

İçerisine Almanya, Italya , Türkiye , Yunanistan , Kanada ekleyin.

Bu ülkeleri tersten yazdırın.


ilk hali :   [Almanya, İtalya, Türkiye, Yunanistan, Kanada]
Tersten hali :   [Kanada, Yunanistan, Türkiye, İtalya, Almanya]

 */

        ArrayList<String> list = new ArrayList<>();
        list.add("Almanya");
        list.add("Italya");
        list.add("Türkiye  ");
        list.add("Yunanistan");
        list.add("Kanada");

        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }
}
