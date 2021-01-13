package _14_Inheritance2;

public class Calisan extends ortakOzellikler_Ana_Class {

    String okul;


    public Calisan(String ad, String soyad, int yas, int telno,String okul) {
        super(ad, soyad, yas, telno);

        this.okul= okul;
    }

    @Override
    public String toString() {
        return "Calisan{" +
                "okul='" + okul + '\'' +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yas=" + yas +
                ", telno=" + telno +
                '}';
    }
}
