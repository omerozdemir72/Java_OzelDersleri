package _14_Inheritance2.hayvanlar;

public class mainClass {

    /*
    hayvan classında

    String renk
    int kolSayisi
    int bacakSayisi;
    boolean kanatVarMi
    boolean gagaVarMi
    String nasilSesCikarir

    bilgileri yazdırmak için bilgilerim isminde "void" bir method oluşturabilirsiniz.
    ya da direkt toString methodu oluşturabilirsiniz.


    Daha sonra main classa geliniz.
    Ve burda hayvan oluşturunuz.

     */

    public static void main(String[] args) {
        hayvanOzellikleri kus = new hayvanOzellikleri("sari", 2, true, false, "cik");

        System.out.println(kus);



        hayvanOzellikleri kopek = new hayvanOzellikleri("siyah",2,false,false,"havhav");

        System.out.println(kopek);
    }




}
