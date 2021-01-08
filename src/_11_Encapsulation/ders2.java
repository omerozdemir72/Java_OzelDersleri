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

            if (soyad.contains("a")){
                System.out.println("A vardır");
        }else
                System.out.println("A yoktur.");
        this.soyad = soyad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if (yas<18){

            System.out.println("yaşınız küçüktür.");
            this.yas = yas;
        }

    }
}



public class ders2 {

    public static void main(String[] args) {

        ogrenci2 ogrenci2 = new ogrenci2();

        ogrenci2.setAd("Ömer");
        ogrenci2.setSoyad("Özbakır");
        ogrenci2.setYas(19);

        System.out.println(ogrenci2.getAd());
        System.out.println(ogrenci2.getSoyad());
       System.out.println(ogrenci2.getYas());

    }
}
