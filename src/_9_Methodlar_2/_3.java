package _9_Methodlar_2;

public class _3 {
    /*
    Bir public static void method oluşturun.
    parametre olarak int a oluşturun.

    Bu methodda   a kadar  (örn:5 ) yani 5 e kadar olan sayıları yazdırın.

  1-2 - 3 -4 -5

    daha sonra a nın değeri main method içerisinden verin.
     */

    public static void myMethod(int sayi) {
        for (int i = 0; i <sayi; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {


        myMethod(4);
        myMethod(10);
        myMethod(200);


    }
}

