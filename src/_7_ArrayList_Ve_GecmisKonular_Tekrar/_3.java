package _7_ArrayList_Ve_GecmisKonular_Tekrar;

import java.util.ArrayList;

public class _3 {
    public static void main(String[] args) {

/*
int arraylist a oluşturun ve      1,2,3,4,5  elemanlarını ekleyin.
int arraylist b oluşturun ve 3,4,5,6,7 elemanlarını ekleyin.

b ' den a yı çıkarın ve kalan elemanları konsola yazdırın.
 */

        ArrayList<Integer>a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);

        ArrayList<Integer>b = new ArrayList<>();
        b.add(3);
        b.add(4);
        b.add(5);
        b.add(6);
        b.add(7);

        b.removeAll(a);
        System.out.println(b);



    }
}
