package _4_For_Loop;

import java.util.Scanner;

public class _3 {
    public static void main(String[] args) {
        /*
        TODO            BREAK

        İstediğimiz durumda loop içerisnden bizi dışarıya atar.

         */
//i 0 dan başlasın. 10 a kadar birer birer artsın.
        for (int i = 0; i <=10 ; i++) {
            System.out.println(i);
            if (i==5){
                break;
            }

        }


        System.out.println("--------**********--------------------------------");

        /*
        Sonsuz döngü
         */

//
//       for (; ;) {
//           System.out.println("a"); //sonsuza kadar a yazdıracaktır.
//       }




        /*  SORU
        sonsuz döngü oluşturun.
    sistem       Bir yazı giriniz desin.
        Eğer girilen stringlerde 'a' harfi var ise sistem döngüden çıksın.
         */

        Scanner sc = new Scanner(System.in);
//
//        for (; ;) {
//            System.out.print("Bir yazı giriniz :   ");
//            String yazi = sc.nextLine();
//
//            if (yazi.contains("a")){
//                break;
//            }
//        }
        for (; ;) {
            System.out.print("1.  giriniz :   ");
            String yazi = sc.nextLine();
            System.out.print("2. giriniz :   ");
            String yazi2 = " "+sc.nextLine();

            if (yazi.concat(yazi2).length()>12){
                System.out.println("Karakter sayısı 12 den büyüktür.");
                break;
            }
        }


        }



    }

