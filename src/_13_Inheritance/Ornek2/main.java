package _13_Inheritance.Ornek2;

public class main {
    public static void main(String[] args) {

        insan arif = new insan();

        arif.boy=175;
        arif.kilo=60;

        arif.buyume();
        arif.spor();
        arif.yemek();
        arif.yemek();

        System.out.println("arif'in boyu = " + arif.boy);
        System.out.println("Arif'in kilosu=" + arif.kilo);



        cocuk can = new cocuk();

        can.boy= 150;
        can.kilo=45;

        can.yemek();
        can.buyume();
        can.spor();
        can.yemek();

        System.out.println(can.boy);
        System.out.println(can.kilo);

    }
}
