package _5_While;

public class _6 {
    public static void main(String[] args) {


        /*
        While döngüsünde, eğer koşul saglanırsa döngü calısır.

        ancak do while döngüsünde do bloğu her halukarda calısır.
         */

        int i = 10;

        while (i<5){
            System.out.println("Merhaba While");
        }


        int a = 10;

        do {
            System.out.println("Merhaba do while");
        }
        while (a<5);
    }
}
