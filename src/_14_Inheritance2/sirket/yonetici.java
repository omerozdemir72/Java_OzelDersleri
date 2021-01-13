package _14_Inheritance2.sirket;

public class yonetici extends calisan {

    int sorumluOlduguKisiSayisi;

    public yonetici(String isim, String departman, int maas,int sorumluOlduguKisiSayisi) {
        super(isim, departman, maas);
        this.sorumluOlduguKisiSayisi = sorumluOlduguKisiSayisi;
    }


    public void Bilgilerim(){
      super.Bilgilerim(); //super class yani calisan classındakii bilgilerim methodunu cagırdım.
        System.out.println("sorumluOlduguKisiSayisi = " + sorumluOlduguKisiSayisi);
    }
}
