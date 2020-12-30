package _6_ArrayList;

import java.util.ArrayList;

public class _1 {

    public static void main(String[] args) {


        System.out.println("-------Arraylist Nasıl Oluşturulur ? ---Eleman EKleme------");

        ArrayList<String> stringArrayList = new ArrayList<>();
        ArrayList<Integer>integerArrayList= new ArrayList<>();


        System.out.println();


        stringArrayList.add("Ömer");
        stringArrayList.add("Ahmet");
        stringArrayList.add("sema");
        stringArrayList.add("hüseyin");
        stringArrayList.add("fatih");


        integerArrayList.add(1);
        integerArrayList.add(2);
        integerArrayList.add(3);
        integerArrayList.add(4);
        integerArrayList.add(5);


        System.out.println("--------------ArrayList elemanlarını yazdırma -------------");

        /*
        1. yol
         */

        System.out.println("String arrayList:   " + stringArrayList);
        System.out.println("Integer arrayList:   " + integerArrayList);

        System.out.println("---------Döngü ile yazdırma ----------");
        /*
        2.yol
         */


        for (int i = 0; i <stringArrayList.size() ; i++) { //size bize eleman sayısını verir.
            System.out.print(stringArrayList.get(i) + " ");
        }

        System.out.println("\n-------------GET METHODU --------------------");
        System.out.println(stringArrayList.get(1));//bana 1. elemanı ver..
        System.out.println(stringArrayList.get(4));//bana 4. elemanı ver..
        //System.out.println(stringArrayList.get(5));//bana 5. elemanı ver.. >>> hata verir.


        System.out.println("-----------ISTEDİGİM İNDEXE ELEMAN GÖNDERME -----------------");

        System.out.println(stringArrayList);
        stringArrayList.add(2,"Saniye");
        System.out.println(stringArrayList);
        stringArrayList.add(3,"Burak");
        System.out.println(stringArrayList);

        System.out.println("--------------UZUNLUK BULMA --------.size();------");

        System.out.println(integerArrayList.size());

        System.out.println(" \n ----------                INDEKSTEKİ ELEMANI DEĞİŞTİRME      ---------   \n" );

        System.out.println("ilk hali :   " + stringArrayList);
        stringArrayList.set(2,"Zeynep"); //2. indeksteki elemanla Zeynep ismini değiştir.
        System.out.println("sonraki hali :   " + stringArrayList);

        System.out.println(integerArrayList);
        integerArrayList.set(2,999);
        System.out.println(integerArrayList);


        System.out.println(" \n ----------              BİR ELEMANIN İNDEKSİNİ BULMA     ---------   \n" );


        System.out.println(stringArrayList);

        System.out.println(stringArrayList.indexOf("Ömer")); //Ömer benim listemde kacıncı indexte ?
        System.out.println(stringArrayList.indexOf("Burak")); //Burak benim listemde kacıncı indexte ?


        stringArrayList.add(4,"Ömer");
        System.out.println(stringArrayList);
        System.out.println(stringArrayList.lastIndexOf("Ömer"));

    }
}
