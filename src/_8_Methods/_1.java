package _8_Methods;

public class _1 {

    public static void main(String[] args) {
        /*
         Kod yazımında belli başlı işlemler için main metodunun içerisini meşgul etmek yerine başka methodlar
    oluşturup buralarda o işlemleri yapabiliriz.
    Methodlar kodların daha okunaklı ve daha düzenli olmasını saglar.

    * başında sadece public var ise, obje olusturmadan (referans) methodlara ulaşamayiz. ---    class1  class1Referans = new class1();

  * ancak basında static var ise obje oluşturmadan direkt main methodunun içerisinde cagırmak istediginiz methodun ismini yazmanız yeterli.
         */
//
  // _1 method = new _1();
//
//   method.topla();


        //static varsa sınıfı cagırmaya gerek yok. Direkt method ismini yaz.
        //static yoksa ( public void carp ();    ) classın ismi ile main methodda referans cagırmalısınız. >   Methodlar method = new Methodlar();
        //public yazmıyorsa     "sadece" kendi classınızdan referans ile cagırabilirsiniz.
      topla(5,4);
        cikar(10,5);
        topla(2,3,7);
        cikar(5,1,8);

        _1 methodlarim = new _1();
        methodlarim.carp(2,4);
        methodlarim.carp(5,88);
   methodlarim.bol(5,2);

    }

    public static void topla(int a, int b){

        System.out.println(a+b);
    }
    public static void topla(int a, int b,int c){

        System.out.println(a+b + c);
    }
    public static void cikar(int a, int b){

        System.out.println("Çıkarma işleminin sonucu : "   + (a-b));
        //üzerine yazmak
    }    public static void cikar(int a, int b,int c){

        System.out.println("Çıkarma işleminin sonucu : "   + (a-b-c));

    }
     void carp(int a, int b){

        System.out.println("Çarpma işleminin sonucu : "   + (a*b));
    }
    void bol(double a, double b){

        System.out.println("bölme işleminin sonucu : "   + (a/b));
    }

}
