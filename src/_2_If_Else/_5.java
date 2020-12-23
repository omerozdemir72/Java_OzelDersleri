package _2_If_Else;

public class _5 {

    public static void main(String[] args) {


           /*
        VE - VEYA    && -- ||

        Ve = &&      Verilen koşulda,
             1. kosul  VE 2. kosulun beraber sağlanmaları gerekiyor.
             2.Iki koşul da sağlanırsa kod çalışır. kodun çalışması için ilk koşulun da SAĞLANMASI ZORUNLUDUR.

    Mavi ve Kırmızı elbise istendiginde, ikisinin de satın alınması gerekiyor. Sadece mavi alınırsa, kırmızı da alınmadıgı için kosul gerceklesmez.



        Veya = ||                                                           Türkçe Klavyede = AltGR + - (tire)
                                                                                    Almanca Klavyede= AltGR + > işareti. (Sol shift tuşunun sağında, y harfinin solunda)
                Verilen   koşulda
                            1. koşul VEYA 2. koşul un olması yeterlidir.
                            Bir koşul sağlanırsa kod çalışır.


         */


int on = 10;
int yirmi = 20;
int otuz = 30;

if (on>=yirmi && on>=otuz){ //on'un yirmiden VE otuzdan büyük olması lazım.
    System.out.println("En büyük sayı 10 dur.");
}else if (yirmi>=on && yirmi>=otuz){ //yirmi'nin en büyük olması içim   on ve otuzdan büyük olması lazım
    System.out.println("En büyük sayı 20'dir.");
}
else
    System.out.println("En büyük sayı 30 dur.");


        System.out.println("---------------------------------------------VE YERİNE VEYA KULLANSAYDIM ???----------------------------------------");

        if (on>=yirmi && on>=otuz){ //on'un yirmiden VE otuzdan büyük olması lazım.
            System.out.println("En büyük sayı 10 dur.");
        }else if (yirmi>=on || yirmi>=otuz){ //Yirmi ondan büyükse VEYA otuzdan büyükse en büyük sayı 20 dir.
            //Burada veya kullandıgım için, 20>=10 durumu pozitiv bir durumdur. Bundan dolayı ikinci kosula bakmadan kod çalışır.
            System.out.println("En büyük sayı 20'dir.");
        }
        else
            System.out.println("En büyük sayı 30 dur.");





    }
}
