package _12_TryCatch;

public class _1_ {
    public static void main(String[] args) {

        /*
        RUNTİME ERROR
       todo  Run yaptıgınızda ortaya çıkan hatadır. Run yaptıgınızda görebildiginiz hatadır.
         */

        /*
        COMPİLE ERROR

       todo    Kod yazım hatası vb. hatalara denir. Sayfanızda class ve package lar kızarır. Calıstırdıgınızda size hata verir.
       Kod yazımı sırasında olusan hatalardır.
         */
/*
Normalde hata alıp devam edemeyecek bir kodu, try kısmının içerisine yazdıgınızda
eğer hata varsa hatayı yakalar, hangi hata oldugunu söyler (hangi exception)  ve tüm kodlar
calısmaya devam eder.
 */
        try { //Kodları buraya yazıyoruz. Hata ihtimali olan veya olmayan
            int [] a = {1,2,3,4,5};
            a[7]=6;
        }catch (ArithmeticException e){ //Sayılar ile ilgili  5/0;
            System.out.println("Hata 1:  " + e.getMessage());

        }catch (ArrayIndexOutOfBoundsException e){//indeks aşımı
       //    e.printStackTrace();//gerçek hataymış gibi konsolda bilgi veriyor
       //       System.out.println( e); //java.lang.ArrayIndexOutOfBoundsException: 7
            System.out.println(e.getMessage()); //7
            e.printStackTrace(); //kırmızı renk ile gerçek bir hata gibi konsolda bilgi veriyor
        }

        System.out.println("aaaaaa");
    }
}
