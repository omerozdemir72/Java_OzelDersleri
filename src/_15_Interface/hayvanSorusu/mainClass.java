package _15_Interface.hayvanSorusu;

public class mainClass {

    public static void main(String[] args) {


        hayvan mirmir = new kedi();

        mirmir.bacakSayisi("4");
        mirmir.renk("Siyah");
        mirmir.ses("miyav");


        hayvan karabas = new kopek();

        karabas.ses("havhav");
        karabas.renk("beyaz");
        karabas.bacakSayisi("4");
    }
}
