package _15_Interface.hayvanSorusu;

public class kopek implements hayvan{
    @Override
    public void renk(String renk) {
        System.out.println(renk);
    }

    @Override
    public void ses(String ses) {
        System.out.println(ses);
    }

    @Override
    public void bacakSayisi(String bacakSayisi) {
        System.out.println(bacakSayisi);
    }
}
