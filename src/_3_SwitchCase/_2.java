package _3_SwitchCase;

import java.util.Scanner;

public class _2 {
    public static void main(String[] args) {

           /*
            hava durumu ile ilgili sistem size "derece giriniz" sorusunu sorsun.
        int derece oluşturarak bir değer giriniz.
        havanın güneşli olup olmadıgını belirlemek için de         boolean sunny               oluşturunuz.
        eğer derece 40 tan fazla ise    "dışarısı çok sıcak!" yazsın ve eğer güneşli ise  (boolean=true ise)  ,   " ayn ı zamanda güneşli ! " yazsın.
        güneşli değil ise (boolean= false ise)       ,      "ve bulutlu "  yazsın.
        40 dereceden düşük ise dışarısı sıcak değil yazsın.
         */
        Scanner sc = new Scanner(System.in);


        System.out.print("Derece giriniz :   ");

        int derece = sc.nextInt();
                //45
        if (derece>40) { //40 dereceden sonrası sıcak sayılıyor

            System.out.println("Dışarısı çok sıcak");
            System.out.println("Güneşli mi ?");

            boolean sunny = sc.nextBoolean(); //true veya false yazabilirim.

            if (sunny == true) {//hava sıcak, ve güneşli mi ?
                System.out.println("Aynı zamanda güneşli.");
            } else
                System.out.println("Ve bulutlu..");
        } else
            System.out.println("dışarısı sıcak değil..");











    }
}
