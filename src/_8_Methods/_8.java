package _8_Methods;

import java.util.Scanner;

public class _8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hesap makinesine hoşgeldiniz !!! \n");

        System.out.print("Sayı 1 :  ");
        double sayi1 = sc.nextInt();

        System.out.print("Sayı 2 :  ");
        double sayi2 = sc.nextInt();

        sc.nextLine();//dummy code
        System.out.println("Yapılacak işlemler :    T (Toplama)  - F (Fark)   - C (Carpma)   -  B (Bölme)");
        String islemTuru = sc.nextLine();


        System.out.println("Sonuç :   " + Sonuc(sayi1,sayi2,islemTuru));
    }

    public static double Sonuc (double sayi1,double sayi2,String islemTuru){

        if (islemTuru.equalsIgnoreCase("T")){
            return sayi1+sayi2;
        }else if (islemTuru.equalsIgnoreCase("f")){
            return sayi1-sayi2;
        }else if (islemTuru.equalsIgnoreCase("C")){
            return sayi1*sayi2;
        }else if (islemTuru.equalsIgnoreCase("B")){
            return sayi1/sayi2;
        }
        else {
            return 0;
        }




    }





}
