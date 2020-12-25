package _3_SwitchCase;

import java.util.Scanner;

public class _1 {
    public static void main(String[] args) {


        /*
        iç içe if else

        Bir kosulun içerisinde başka bir koşul olma durumudur.


        Örnek: Karşınızdaki insana "Eğer java biliyorsan sana sorular soracagım" dediginiz varsayalım.
        Eğer evet derse, yani koşul saglanırsa, soru sormaya yani diğer kosullara başlarsınız.

        Ancak Hayır cevabı alırsanız, direkt Else bloguna iniyorsunuz ve "Tamam o zaman sormuyorum " cevabını veriyorsunuz.
         */


        Scanner sc = new Scanner(System.in);

        System.out.print("Sayı   :  ");

        int sayi = sc.nextInt();
//20
        if (sayi<100){ //java biliyo musun ? Eğer biliyorsan sana 2 soru sorucam.

            System.out.println("100 den küçük");

            if (sayi<50){ //soru 1
                System.out.println("50'den de küçük");

                if (sayi<25){ //soru 2

                    System.out.println("25'ten de küçük");
                }
            }
        }else  // eğer java bilmiyorsan bu bloga gelir
            System.out.println("100'den büyüktür.");

    }
}
