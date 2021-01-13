package _14_Inheritance2.hayvanlar;

public class hayvanOzellikleri {
    String renk;
    int kolSayisi;
    boolean kanatVarMi;
    boolean gagaVarMi;
    String nasilSesCikarir;


    public hayvanOzellikleri(String renk, int kolSayisi, boolean kanatVarMi, boolean gagaVarMi, String nasilSesCikarir) {
        this.renk = renk;
        this.kolSayisi = kolSayisi;
        this.kanatVarMi = kanatVarMi;
        this.gagaVarMi = gagaVarMi;
        this.nasilSesCikarir = nasilSesCikarir;
    }

    /*
    toString methodu, işlemlerimizi stringe cevirip konsola yazdırır.bilgi almamızı saglar.
     */
    @Override
    public String toString() {
        return "hayvanOzellikleri{" +
                "renk='" + renk + '\'' +
                ", kolSayisi=" + kolSayisi +
                ", kanatVarMi=" + kanatVarMi +
                ", gagaVarMi=" + gagaVarMi +
                ", nasilSesCikarir='" + nasilSesCikarir + '\'' +
                '}';
    }
}
