package _6_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class _3 {
    public static void main(String[] args) {

        /*
        bir int Arraylist olusturun. sayi

        5,88,4,23
         */
        ArrayList<Integer> sayi = new ArrayList<>();

        sayi.add(5);
        sayi.add(88);
        sayi.add(4);
        sayi.add(23);

        System.out.println(sayi);

        Collections.sort(sayi); //içerisine hangi arraylisti sıralamak istiyorsanız onu yyazın !
        System.out.println("Sıralanmış hali :   " + sayi);

        System.out.println("-----------MAX - MİN -----------------");
        /*
        max - min
         */

        System.out.println("Max :  " + Collections.max(sayi));
        System.out.println("Min :  " + Collections.min(sayi));


        System.out.println("------------- LİSTEYİ TERS ÇEVİRME -----------");

        System.out.println("ilk hali :    " + sayi);
        Collections.reverse(sayi);

        System.out.println("Tersten hali :    " + sayi);


//Fill methodu ile arraylistinizin içerisindeki elemanları tek tip yapabilirsiniz.
        Collections.fill(sayi,100);
        System.out.println(sayi);
    }
}
