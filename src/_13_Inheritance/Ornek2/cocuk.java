package _13_Inheritance.Ornek2;

public class cocuk extends insan {

    void yemek() {
        kilo=kilo+3;
    }


    void spor() {
        super.spor();
        kilo=kilo+1;
    }


    void buyume() {
            boy=boy+5;
    }
}
