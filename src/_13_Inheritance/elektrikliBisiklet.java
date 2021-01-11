package _13_Inheritance;

public class elektrikliBisiklet extends bisiklet {

    int akuKapasitesi;
    boolean gps;

    public elektrikliBisiklet(String renk, int kacTeker, double tekerlekBoyutu, boolean ziliVar,int akuKapasitesi,boolean gps) {
        super(renk, kacTeker, tekerlekBoyutu, ziliVar);

        this.akuKapasitesi= akuKapasitesi;
        this.gps=gps;
    }

    @Override
    public String toString() {
        return "elektrikliBisiklet{" +
                "akuKapasitesi=" + akuKapasitesi +
                ", gps=" + gps +
                '}';
    }

    void infoElektrikli(){

        System.out.println("renk = " + renk);
        System.out.println("ziliVar = " + ziliVar);
        System.out.println("tekerlekBoyutu = " + tekerlekBoyutu);
        System.out.println("kacTeker = " + kacTeker);
        System.out.println("gps = " + gps);
        System.out.println("akuKapasitesi = " + akuKapasitesi);
    }
}
