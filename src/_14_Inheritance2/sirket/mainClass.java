package _14_Inheritance2.sirket;

import _14_Inheritance2.Yonetici;

public class mainClass {
    /*
calisan isminde bir class oluşturun.
private String isim
private String departman
private int maas;

public int zam isminde method oluşturun.


500 tl zam yapsın.
return olarak maaşı döndürün

void bilgilerim diye bir method oluşturun ve bilgileri yazdırın.

yönetici classı olusturun.  calisan classındaki bilgilere sahip olsun ve ekstra int sorumluOlduguKisiSayisi oluşturun.

Bilgilerini yazdırmak için method oluşturun.

      (  Hakan'ın maaşının zamlı hali 2000 olsun. )

main classta cağırın ve konsol böyle bir görüntü olsun :
Bilgiler Yükleniyor....
isim = Hakan
departman = Bilişim
maas = 2000
----------------------------------------
Bilgiler Yükleniyor....
isim = Hatice
departman = Satış
maas = 1700
----------------------------------------
Bilgiler Yükleniyor....
isim = Ömer
departman = Yönetici
maas = 3500
Sorumlu olduğu kişi sayısı : 100

*/

    public static void main(String[] args) {

        calisan sekreter = new calisan("Hakan","Bilişim",2000);

        sekreter.Bilgilerim();

        sekreter.zam();
        sekreter.Bilgilerim();

        System.out.println("-----------------------------");

        calisan satisDanismani = new calisan("Hatice","Pazarlama",1700);

        satisDanismani.Bilgilerim();

        System.out.println("---------------------------------");

        yonetici mudur = new yonetici("Ömer","Yönetim",4000,100);

        mudur.Bilgilerim();
        mudur.zam();
        mudur.zam();
        mudur.zam();
        mudur.zam();
        mudur.Bilgilerim();




    }
}
