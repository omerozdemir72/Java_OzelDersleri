package _3_SwitchCase;

import java.util.Scanner;

public class _3 {
    public static void main(String[] args) {
/*
4 e kadar sayı giriniz.
Bu 4 sayıdan farklı bir  sayı girilirse "geçersiz sayı" uyarısını versin.
 */
        Scanner sc = new Scanner(System.in);

        System.out.print("Sayı gir :");

        int sayi = sc.nextInt();
                    //5
        switch (sayi) {//Eğer sayı,

            case 1: //bir ise,
                System.out.println("Bir");

                break; //koşulu bitirir.

            case 2: //2 ise
                System.out.println("iki");

                break;


            case 3://3 ise
                System.out.println("üç");

                break;
            case 4:
                System.out.println("dört");


            default://else gibi düşünün. Yukarıdakilerden hiçbiri değilse, yani 1,2,3,4 değil ise

                System.out.println("Geçersiz sayı");
        }




    }
}
