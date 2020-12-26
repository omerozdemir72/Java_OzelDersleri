package _4_For_Loop;

public class _3 {
    public static void main(String[] args) {
        /*
        TODO            BREAK

        İstediğimiz durumda loop içerisnden bizi dışarıya atar.

         */
//i 0 dan başlasın. 10 a kadar birer birer artsın.
        for (int i = 0; i <=10 ; i++) {
            System.out.println(i);
            if (i==5){
                break;
            }

        }


        System.out.println("--------**********--------------------------------");

        /*
        Sonsuz döngü
         */


        for (; ;) {
            System.out.println("a"); //sonsuza kadar a yazdıracaktır.
        }
        }

    }
}
