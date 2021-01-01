package _7_ArrayList_Ve_GecmisKonular_Tekrar;

import java.util.Scanner;

public class _4 {

    public static void main(String[] args) {

        /*
        Sisteme bir sayı giriniz.
        eğer bu sayının 3 ile çarpımı bir çift sayı ise "sonuç çifttir"
        tek sayı ise "sonuç tektir" yazısını versin.

         */

        Scanner sc = new Scanner(System.in);

        int sayi = sc.nextInt();

        int carpan= sayi*3;
        if (carpan%2==0){
            System.out.println("Sayı cifttir." + carpan);
        }
        else
            System.out.println("Sayı tektir." + carpan);

    }
}
