package _16_AbstractClass.islemlerSorusu;

public class islemler extends abstractClass{

    public void islemleriYap(){

        topla(3,5);
        cikar(5,1);
        carp(6,7);
        bol(20,4);
    }

    public static void main(String[] args) {

            islemler i = new islemler();

            i.islemleriYap();


    }

}
