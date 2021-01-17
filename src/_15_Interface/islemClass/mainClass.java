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

/*
bir i miz var. bu 0'dan başlasın. 5 e kadar gelsin. ama 5 e eşit olmasın.
bu nedemek ?  5 kez dönsün. ve 1 er 1 er artsın.
1 er 1er artacak olan ne ? tabiki de i.
ben i yi yazdırmalıyım ki arttıkça konsola yazılsın.
yani
1
2
3
4

 */

        int sayac = 0;
        while (sayac<5){

            System.out.println("aaaa");

            sayac++
            ;
        }
    }
}
