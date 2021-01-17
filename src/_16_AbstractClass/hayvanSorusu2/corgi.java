package _16_AbstractClass.hayvanSorusu2;

public class corgi extends kopek{
    @Override
    public void besin() {
        System.out.println("Corgiler sadece proteinli mama yer.");
    }

    @Override
    public void ayakSayisi() {
        System.out.println("4 ayak ");
    }
}
