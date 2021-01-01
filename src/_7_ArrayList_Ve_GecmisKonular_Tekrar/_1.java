package _7_ArrayList_Ve_GecmisKonular_Tekrar;

import java.util.ArrayList;
import java.util.Scanner;

public class _1 {
    public static void main(String[] args) {
/*
Bir arraylist oluşturunuz. For döngüsü ile bu arrayListe  5 adet eleman gönderiniz. (Scanner ile)

Daha sonra bu arrayLİsti yazdırıp elemanları konsolda görünüz.
 */

        Scanner sc = new Scanner(System.in);

        ArrayList<String> arrayList = new ArrayList<>();


        for (int i = 0; i < 5; i++) {
        arrayList.add(sc.nextLine());

        }
        System.out.println(arrayList);
    }
}
