package _16_AbstractClass;

public abstract class Animal {
//gövdesiz methodları extends edilen classlarda KULLANMAK ZORUNDAYIZ !!!

    /*
    Abstract classlar inheritance ve interface classların birleşimi gibidir.
    hem gövdeli hem gövdesiz methodları olabilir.
    HATIRLATMA: Inheritance da gövdesiz method oluşturamayız.
     interface de de gövdeli method oluşturamayız.
     ancak abstract classta ikisi de mümkün.

     Gövdesiz methodlar abstract method olmalıdır.
     public abstract void myMethod();
     */
    public abstract void animalSound();

    public void uyku(){

        System.out.println("ZZzz");
    }
}

class Pig extends  Animal{


    @Override
    public void animalSound() {
        System.out.println("wee wee");
    }
}

class myMainClass{


    public static void main(String[] args) {

        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.uyku();
    }
}
