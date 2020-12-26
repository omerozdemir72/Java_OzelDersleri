package _4_For_Loop;

public class _2 {
    public static void main(String[] args) {

        /*
        i+=2   ==    i = i + 2       i 2'şer 2'şer artar
        i-=4    ==    i= i-4           i 4'er 4'er azalır.
        i*=2   ==   i = i * 2         i kendisini sürekli 2 ile çarpar.
         */
        for (int i = 0; i <=20 ; i+=2) {
            System.out.println(i);
        }
        System.out.println("------------------------------------------------****-----------------------");

        /*
        i 20 ye eşit olsun.
        i 0'dan büyük ve eşit olsun.
        i 4er 4er azalsın.
         */
        for (int i = 20; i >=0 ; i-=4) {
            System.out.println(i);
        }

    }
}
