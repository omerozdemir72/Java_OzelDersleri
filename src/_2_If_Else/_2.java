package _2_If_Else;

import java.util.Scanner;

public class _2 {
    public static void main(String[] args) {


        /*
        ÇİFT SAYILARI NASIL BULURUZ ?
        bir sayı gir.
        çift ise   "bu sayı çifttir"
        tek ise (Çift olmadıgı her durum için) "bu sayı tektir"

         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Bir sayı giriniz :  ");

            int sayi = sc.nextInt();

        if (sayi%2==0){ // eğer sayının 2 ye bölümünden kalan  0 'ise

            System.out.println("Bu sayı çifttir.");
        }
        else
            System.out.println("Bu sayı tektir.");



    }
}
