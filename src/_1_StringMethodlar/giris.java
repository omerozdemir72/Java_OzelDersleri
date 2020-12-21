package _1_StringMethodlar;

public class giris {

    public static void main(String[] args) {

/*
index of

Belirli bir karakterin hangi indexte başladığını bize söyler.
0'dan başlar.
 */
        System.out.println("------------------------------INDEXOF----------------------------------- \n");
        String uni = "Adana Universitesi";

        System.out.println("   'n' harfinin indexi >>>>  " + uni.indexOf("n"));
        System.out.println("   'i' harfinin indexi >>>>  " + uni.indexOf("i"));

        /*
        lastindexOf
        belirledigimiz bir karakterin sondan başlayarak indexini verir.
        0'dan başlar
         */
        System.out.println("------------------------------LAST INDEXOF----------------------------------- \n");
        System.out.println("'  n  ' harfinin sondan indexi >>>   " + uni.lastIndexOf("n"));
        System.out.println("   'i' harfinin indexi >>>>  " + uni.indexOf("i"));
        System.out.println("   'i' harfinin sondan indexi >>>>  " + uni.lastIndexOf("i"));


/*
charAt
String içerisinde, istenilen indexteki karakteri bize verir.
0'dan başlar !

 */
        System.out.println("-------------------------------charAt---------------------------------- \n");
String sehir = "istanbul";

        System.out.println("5. indexteki karakter >>>  " + sehir.charAt(5));
      //  System.out.println("5. indexteki karakter >>>  " + sehir.charAt(8)); //toplam indexin dısına cıkar, hata verir
        System.out.println("0. indexteki karakter >>>  " + sehir.charAt(0));

/*
substring

Bir stringin, istenilen kısımdan sonrasını ayırır ve yazdırır.
//1 ' den başlıyor.
 */
        System.out.println("-----------------------------------SUBSTRİNG------------------------------ \n");
String a = "Yurdakul";

        System.out.println("5. sıradan sonrakini yazdır >>" + a.substring(5)); //kul
        System.out.println("4. sıradan sonrakini yazdır >>" + a.substring(4));//akul

        //başlangıcını ve bitişini belirtip bir aralığı da Stringten ayırabiliriz ..
        System.out.println("başlangıç ve bitiş >>>> " + a.substring(3,6));


        System.out.println("----------------------------TRİM------------------------------------- \n");

        /*
        başta ve sondaki boşlukları temizler.
         */
        String trim = "       Ömer             Özdemir    s     s";

        System.out.println(trim.trim());

        System.out.println("----------------------------Replace   -   ReplaceAll------------------------------------- \n");

        /*
        Bir karakteri başka bir karakter ile değiştirmek istiyorsam bu methodları kullanırım.
         */

String h = "adana Mahallesi Marketi";

        System.out.println("a harfleri yerine @ koy >>>>   " + h.replace("a","@"));


        String fistik ="yer fistigi";

        System.out.println("'yer ' dizisi yerine 'antep ' yazdır >>>>>    " + fistik.replaceAll("yer","antep"));

        System.out.println("----------------------------Equals  -  EqualsIgnoreCase------------------------------------- \n");

        String isim = "Techno Study";

        System.out.println(isim.equals("techno Study")); // false cevabını verecektir. Çünkü büyük küçük harf duyarlılığı vardır.
        System.out.println("Birebir yazılımı  >>>   " + isim.equals("Techno Study"));
/*
eğer büyük küçük duyarlılıgını istemiyorsanız equalsIgnoreCase methodunu kullanın.
Büyük veya küçük yazmanız farketmez. Sistem sadece karakterleri kontrol eder ve eşleştirir.
 */
        System.out.println("büyük küçük harf duyarlılığı olmadan >>>    " + isim.equalsIgnoreCase("tEcHNo StuDy"));
        System.out.println("büyük küçük harf duyarlılığı varken >>>    " + isim.equals("tEcHNo StuDy"));
        System.out.println("----------------------------Upper-LowerCase------------------------------------- \n");

        System.out.println("String :  " + isim);
        System.out.println("Büyük harfe çevir: UpperCase >>>  " + isim.toUpperCase());
        System.out.println("Küçük harfe çevir : LowerCase >>>" + isim.toLowerCase());

        System.out.println("----------------------------Concat------------------------------------ \n");


        /*
        iki stringi birbirine bağlar..
         */


        String t = "Techno";
        String s = "Study";

        System.out.println("concat ile :   " + t.concat(" " + s));



        System.out.println("----------------------------Length------------------------------------ \n");

        /*
        String'in uzunluğunu, karakter sayısını bize verir.

        space ler de bir karakter oldugu için onları da sayar.
         */

        String b = "Techno Study Avrupa SDET Programı Techno Study Avrupa SDET ProgramıTechno Study Avrupa SDET ProgramıTechno Study Avrupa SDET ProgramıTechno Study Avrupa SDET ProgramıTechno Study Avrupa SDET Programı";


        System.out.println("b nin uzunlugu :   " + b.length()); //199

        int bninKarakterSayisi = b.length();

        System.out.println("b'nin karakter sayısı :   " + bninKarakterSayisi);

        System.out.println("----------------------------isEmpty------------------------------------ \n");

        /*
        String boş mu yoksa dolu mu ? Cevap true veya false döner.
         */

        String s1 = "";
        System.out.println(b.isEmpty());
        System.out.println("s1 boş mu dolu mu ?   " + s1.isEmpty());



    }
}
