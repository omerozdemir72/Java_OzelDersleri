package _5_While;

public class _1 {
    public static void main(String[] args) {
//
//        for (int i = 0; i <= 5; i++) {
//            system.out.print(i);
//        }
/*
ADIMLR
1.Sayacı belirle    int  i = 0;
2.Sayaç kaça kadar devam edecek? Döngü kaç kez dönecek?
3.döngüde ne yazdırmak istiyorum?
5.sayac kaç kaç artacak ? i++;      i+=2;
 */
        int sayac = 0; //sayac kaçtan başlayacak?
        while (sayac<=5){   //0'dan kaça kadar devam edecek ? Döngü kaç tur olacak?
            System.out.print(sayac);

            sayac++; //Sayaç 1er 1 er artacak >>>   0     1     2    3    4     5
        }
        System.out.println();

        System.out.println(" -------------------********------------------");
        System.out.println("FOR DÖNGÜSÜ TERSTEN YAZDIRMA ");

        for (int i = 10; i >0 ; i--) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("----WHİLE DÖNGÜSÜ İLE TERSTEN YAZDIRMA -----");

            int sayac2 =10;

            while (sayac2>0){

                System.out.print(sayac2 + " | ");

                sayac2--;

            }

    }
}
