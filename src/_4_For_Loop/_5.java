package _4_For_Loop;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import javax.swing.plaf.IconUIResource;

public class _5 {
    public static void main(String[] args) {

        /*
        bir dizide belirli bir durumu atlamak,yok saymak, geçmek için continue kullanırız.
        Örn: Elimizdeki veritabanında 20 adet veri var. Ancak ben 5. veriy atlamak, geçmek istiyorum.
         */

        int verisayisi = 20;
        for (int i = 0; i <verisayisi ; i++) {

                if (i==10){ // i    5 e eşit olunca atla. 5 i yazma. 6 dan devam et.
                    continue;
                }
            System.out.println(i);
        }
        System.out.println("-----------************------------------");



    }
}
