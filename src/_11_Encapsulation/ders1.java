package _11_Encapsulation;

class ogrenci{
     String ad;
    String soyad;
    int yas;
}
public class ders1 {

    public static void main(String[] args) {

        ogrenci ogrenci = new ogrenci();

        ogrenci.ad="Ömer";
        ogrenci.soyad="Özdemir";
        ogrenci.yas=23;

        System.out.println(ogrenci.ad);
        System.out.println(ogrenci.soyad);
        System.out.println(ogrenci.yas);





    }
}



