package _5_While;

public class _2 {
    public static void main(String[] args) {
        /*
        int i olusturun ve değeri 0 olsun.

        while döngüsü oluşturun.

        20 ye kadar olan tüm sayıları toplayın.
         *

         */
        int i = 0;
        int toplam = 0;
        while (i<20){

            toplam = toplam+i;
            i++;
        }
        System.out.println(toplam);


    }
}
