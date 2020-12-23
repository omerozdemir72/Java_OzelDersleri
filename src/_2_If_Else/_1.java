package _2_If_Else;

import java.util.Scanner;

public class _1 {

    public static void main(String[] args) {

        /*
bir koşul durumunda if kullanılırız.
Else ise, bütün if bloklarındaki koşullar sağlanmazsa en son else butonuna gider.
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Yaşınızı giriniz :   ");

        int yas =  sc.nextInt();

            if (yas>=18){ //18 üstü tüm yaş grupları için. 120 2000 20
                System.out.println("Sigara alabilirsin.");
            }
            else //yukarıdaki koşullar dısındaki bütün ihtimaller . negatif sayılar
                System.out.println("Yaşınız tutmuyor.");
    }
}
