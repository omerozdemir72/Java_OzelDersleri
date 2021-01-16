package _15_Interface.islemClass;

public class mainClass {
    /*
    Methodlar isminde bir interface sınıfı oluşturun.

    Bu class'ın içerisinde void dongu   isminde bir method olsun ve "parametre" olarak int a ekleyin.

    daha sonra islemler class ı oluşturun ve methodlar classını kalıtım olarak alsın.

    otomatik olarak gelen methodun içerisine bir for döngüsü yazın.
    Döngü 0'dan  a'ya kadar sayıları yazdırsın.

    ve main classa gelip once islemler classını tanıtın.
    ve a yerine  3 yazın.


     */

    public static void main(String[] args) {

        islemler islemler = new islemler();

        islemler.dongu(10);
    }
}
