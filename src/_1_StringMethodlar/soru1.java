package _1_StringMethodlar;

import java.util.Scanner;

public class soru1 {

    public static void main(String[] args) {
/*
Scanner kullanarak 2 ayrı Stringi birbirine bağla.

-Birbirine bağla : Concat


 */

        Scanner scanner = new Scanner(System.in);

        System.out.print("ilk String'i giriniz:    ");

        String ilkString = scanner.nextLine();

        System.out.print("İkinci String'i giriniz  :     ");
        String ikinciString = " " + scanner.nextLine();

        String tamami = ilkString.concat(ikinciString);
        System.out.println("iki stringin birleşimi :  " + tamami);



    }
}
