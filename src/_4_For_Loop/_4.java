package _4_For_Loop;

import java.util.Scanner;

public class _4 {
    public static void main(String[] args) {
/*
bir değer girelim ve o degere kadar olan bütün sayıları toplasın.
 */
        Scanner sc = new Scanner(System.in);

       System.out.print("Bir sayı giriniz:   ");
       int sayi = sc.nextInt();

int toplam =0;
        for (int i = 1; i <=sayi ; i++) {
            toplam=toplam+i;
        }
        System.out.println(toplam);

    }
}
