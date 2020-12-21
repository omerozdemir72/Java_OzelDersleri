package _1_StringMethodlar;

import java.util.Scanner;

public class sorular {

    public static void main(String[] args) {

        System.out.println("---------------soru1 ----------------");

String cumle = "Damlaya damlaya göl olur.";
   /*
        'L' harfinin indexini bulunuz.(soldan sağa)
        'L' harfinin tersten indexini bulunuz.(sağdan sola)
        ve bu aralıktaki karakterler ile yeni bir cümle oluşturunuz.
        L 'den L'ye
         */
        System.out.println(cumle.indexOf("l")); //ilk L harfi
        System.out.println(cumle.lastIndexOf("l"));//sondan L harfi

        System.out.println("yeni cümle :  " + cumle.substring(3,21));


        System.out.println("---------------soru2 ----------------");
/*
String isim     içerisindeki karakter sayısı 10'dan büyük ise, bütün karakterleri büyük harfe çevirsin.
 */

String isim = "ÖmER Özdemir";

if (isim.length()>10){

    System.out.println(isim.toUpperCase());
}


        System.out.println("---------------soru3 ----------------");


        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); //String s, benim konsola yazdıgım şeye eşittir.
        System.out.println(s.length());


    }
}
