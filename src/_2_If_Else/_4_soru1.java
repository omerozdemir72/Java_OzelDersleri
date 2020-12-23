package _2_If_Else;

import java.util.Scanner;

public class _4_soru1 {
    public static void main(String[] args) {

/*

Sistem size            "Bir String giriniz."   cümlesini versin.
hepsi if in içinde olacak !
Eğer Stringde    a karakteri varsa,   a karakterinden sonraki kısım ile yeni bir string kaydedilsin ve tüm harfleri büyük olsun. (a karakteri dahil)
Daha sonra     ilk stringi yazdırınız, altına da a karakterinden sonraki kısma sahip olan Stringi yazdırınız

Eğer a karakteri yoksa "Girdiğiniz Stringde a karakteri yoktur..     mesajını versin.

örn:    String giriniz:
    If else çok kolay gibi

 Yeni String= AY GİBİ
 Eski String = çok kolay gibi

 */

        Scanner sc = new Scanner(System.in);
        System.out.print("Bana bir string yaz :       ");
        String s = sc.nextLine(); //ekrem
        if (s.contains("a")){

            String yeni =s.substring(s.indexOf("a")).toUpperCase();
            System.out.println("Yeni Mesaj :  " + yeni);
            System.out.println("Eski string :" + s);
        }
        else
            System.out.println("a yoktur.   >>>>  " + s);


    }
}
