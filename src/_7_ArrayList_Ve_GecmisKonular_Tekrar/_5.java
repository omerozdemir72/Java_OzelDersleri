package _7_ArrayList_Ve_GecmisKonular_Tekrar;

import java.util.Scanner;

public class _5 {
    public static void main(String[] args) {

        /*
        Scanner ile bir sayı giriniz.
        sistem girdiginiz sayıdan 0'a kadar 2şer 2şer azalsın.

        örn: Sayı giriniz:    20

        18  16    14    12  ....

         */

        Scanner sc = new Scanner(System.in);

int sayi = sc.nextInt();

        for (int i=sayi ; i >=0 ; i-=2) {
            System.out.println(i + "  ");
        }



    }
}
