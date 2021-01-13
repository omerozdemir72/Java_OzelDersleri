package _8_Methods;

public class _2 {
    public static void main(String[] args) {
        /*
void methodlar dışında bir de dönüşü olan methodlarımız vardır. Bunları değişken bazlı oluştururuz.

 */

       _1 a = new _1();

        _1.topla(1,2);
        _1.cikar(5,2);


        a.bol(2,1);


        System.out.println(topla(10,20));
        System.out.println(cikar(20,5));
        System.out.println(bol(20,5));
        System.out.println(carp(20,5));
    }

    public static int topla(int a, int b){

   return a+b;//a ve b nin toplamını bana main methoddaki degerlere göre döndür.

    }

    public static int cikar(int a, int b){
        return a - b;
    }

    public static int bol(int a, int b){
        return a /b;
    }
    public static int carp(int a, int b){
        return a*b;
    }

}
