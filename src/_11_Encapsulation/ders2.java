package _11_Encapsulation;


class ogrenci2{

  private   String ad;
    private String soyad;
    private int yas;

/*
setter :   düzenlemelerin yapıldığı, main methodda değer verilen methoddur.
getter : çağırılan methoddur.
 */
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }
}



public class ders2 {

    public static void main(String[] args) {

        ogrenci2 ogrenci2 = new ogrenci2();

        ogrenci2.setAd("Ömer");
        ogrenci2.setSoyad("Özdemir");
        ogrenci2.setYas(12);

        System.out.println(ogrenci2.getAd());
        System.out.println(ogrenci2.getSoyad());
        System.out.println(ogrenci2.getYas());

    }
}
