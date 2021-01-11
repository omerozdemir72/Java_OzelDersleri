package _13_Inheritance;

public class bisiklet {

    String renk;
    int kacTeker;
    double tekerlekBoyutu;
    boolean ziliVar;

    public bisiklet(String renk, int kacTeker, double tekerlekBoyutu, boolean ziliVar) {
        this.renk = renk;
        this.kacTeker = kacTeker;
        this.tekerlekBoyutu = tekerlekBoyutu;
        this.ziliVar = ziliVar;

    }

    @Override
    public String toString() {
        return "bisiklet{" +
                "renk='" + renk + '\'' +
                ", kacTeker=" + kacTeker +
                ", tekerlekBoyutu=" + tekerlekBoyutu +
                ", ziliVar=" + ziliVar +
                '}';
    }


    public void info(){

        System.out.println("Renk : " + this.renk);
        System.out.println("Teker sayısı : " + this.kacTeker);
        System.out.println("tekerlekBoyutu = " + tekerlekBoyutu);
        System.out.println("ziliVar = " + ziliVar);
    }


}
