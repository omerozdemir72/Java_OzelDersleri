package _7_ArrayList_Ve_GecmisKonular_Tekrar;

import java.util.Scanner;

public class _7 {
    public static void main(String[] args) {
/*
BEDEN KİTLE INDEKSİ

Sisteme boy ve kilo girin.
kitle indeksini bulmak için    kilo / (boy * boy) işlemini yapınız.


eğer kitle indeksiniz 18.5 ten küçük çıkarsa -> Zayıf
18.5 ile 24.9 arasında ise  -Normal
25.9 ile 29.9 arasında ise kilolu
29.9 ile 34.9 arasında ise 1.derece obez

cevaplarını versin.

not: Sonuçlar ondalıklı olacaktır. Değişken tipini bu duruma göre belirleyiniz.
 */
        Scanner sc = new Scanner(System.in);


        System.out.print("Boy :   ");
        float boy = sc.nextFloat();

        System.out.print("Kilo : ");
        float kilo = sc.nextFloat();

        float kitleindeksi = kilo/(boy*boy);


        System.out.println("Kitle indeksim :   " + kitleindeksi);


        if (kitleindeksi <18.5) {
            System.out.println("zayıf");
        }else if (kitleindeksi>=18.5 && kitleindeksi<=24.9){
            System.out.println("normal");
        }else if (kitleindeksi>=25.9&& kitleindeksi<=29.9){
            System.out.println("kilolu");
        }else if (kitleindeksi>=29.9 && kitleindeksi<=34.9){
            System.out.println("1. derece obez");
        }
    }
}
