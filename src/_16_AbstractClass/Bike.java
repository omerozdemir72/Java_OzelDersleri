package _16_AbstractClass;

public abstract class Bike {
    /*
    eger Bike classını main classta referans olarak cagırırsam, constructor içerisindeki işlemler gerçekleşir.
     */
    public Bike(){
        System.out.println("Bisiklet oluşturuldu.");
    }

abstract void calistir();


    public void vitesiDegistir(){

        System.out.println("Vites yükseltildi.");
    }
}
class Honda extends Bike{


    @Override
    void calistir() {
        System.out.println("Bisiklet çalışıyor...");
    }
}
class myMainClass2{
    public static void main(String[] args) {

        Bike bisiklet = new Honda();

        bisiklet.calistir();
        bisiklet.vitesiDegistir();
    }


}
