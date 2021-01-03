package _8_Methods;

import org.omg.CORBA.PUBLIC_MEMBER;

public class _5 {

    public static void main(String[] args) {

        baslik("ÇALIŞAN BİLGİLERİ");
        duzCizgi("______________");
        bilgiler("Ömer","Özdemir","QA");
        duzCizgi("-------------------------");
        bilgiler("Saniye","Kılıç","SOFTWARE");
        duzCizgi("/////////////////////");
        bilgiler("Ahmet","Dağ","Database");
        duzCizgi("****---****----****---***-");
    }

    public static void bilgiler(String isim, String soyisim , String departman){

        System.out.println("İsim :   "+isim);
        System.out.println("Soyisim :   "+soyisim);
        System.out.println("departman :   "+departman);

    }
    public static void duzCizgi(String simgeler){

        System.out.println(simgeler);
    }
    public static void baslik(String a){

        System.out.println(a);
    }
}
