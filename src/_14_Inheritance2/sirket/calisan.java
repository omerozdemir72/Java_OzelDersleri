package _14_Inheritance2.sirket;

public class calisan {

    private String isim;
    private String departman;
    private int maas;


    public calisan(String isim, String departman, int maas) {
        this.isim = isim;
        this.departman = departman;
        this.maas = maas;
    }

    public int zam(){

        return maas= maas+500; //maas+=500;
    }


    public void Bilgilerim(){
        System.out.println("Bilgiler yükleniyor.... \n");
        System.out.println("isim = " +this.isim);
        System.out.println("departman = " + this.departman);
        System.out.println("maas = " + this.maas);
    }

}
