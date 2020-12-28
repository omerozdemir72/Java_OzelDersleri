package _5_While;

import java.util.Random;
import java.util.Scanner;

public class _5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int randomsayi = random.nextInt(10);

        int count = 0;
        int count2 = 2;
        System.out.println("KELİME OYUNUNA HOŞGELDİNİZ ***   \n");
        while (true){

            System.out.print("Tahmin giriniz  :  ");
            int tahmin = sc.nextInt();


            if (tahmin<randomsayi){
                System.out.println("Daha büyük düşün !");

            }else if (tahmin>randomsayi){
                System.out.println("Daha düşük düşün !");
            }else {
                System.out.println("BİLDİN !!");
                break;
            }
        }
        System.out.println("RANDOM SAYI :     " + randomsayi);
    }
}
