package _5_While;

public class _3 {

    public static void main(String[] args) {

        /*
        CONTİNUE
         */

        int sayac = 0;
        while (sayac<10){
            sayac++;
            if (sayac==8){
                continue;
            }
            System.out.println(sayac);

        }
    }
}
