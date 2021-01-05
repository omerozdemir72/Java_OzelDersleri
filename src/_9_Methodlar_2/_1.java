package _9_Methodlar_2;

public class _1 {
    /*
    public static void method oluşturun.
    int a parametre oluşturun.
    methodun içinde koşul oluşturun ve eğer     a     çiftse çifftir,
    tekse tektir yazsın. Main methoddan sayı değeri verin.
     */
    public static void main(String[] args) {

        method(6);

    }
    public static void method(int a){

        if (a%2==0){
            System.out.println("Çifttir");
        }
        else
            System.out.println("Tektir.");
    }


}
