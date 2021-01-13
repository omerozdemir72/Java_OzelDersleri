package _14_Inheritance2;

public class Yonetici extends ortakOzellikler_Ana_Class {

    String spor;


    public Yonetici(String ad, String soyad, int yas, int telno,String spor) {
        super(ad, soyad, yas, telno);
        this.spor= spor;

    }

    @Override
    public String toString() {
        return "Yonetici{" +
                "spor='" + spor + '\'' +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yas=" + yas +
                ", telno=" + telno +
                '}';
    }
}
