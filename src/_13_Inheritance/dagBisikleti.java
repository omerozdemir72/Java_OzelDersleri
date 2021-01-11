package _13_Inheritance;

public class dagBisikleti extends bisiklet {

    int vitesSayisi;
    boolean araziTekeri;


    public dagBisikleti(String renk, int kacTeker, double tekerlekBoyutu, boolean ziliVar,int vitesSayisi,boolean araziTekeri) {
        super(renk, kacTeker, tekerlekBoyutu, ziliVar);

        this.vitesSayisi= vitesSayisi;
        this.araziTekeri=araziTekeri;
    }

    @Override
    public String toString() {
        return "dagBisikleti{" +
                "vitesSayisi=" + vitesSayisi +
                ", araziTekeri=" + araziTekeri +
                '}';
    }


    void infoDagBisikleti(){
        System.out.println("renk = " + renk);
        System.out.println("tekerlekBoyutu = " + tekerlekBoyutu);
        System.out.println("kacTeker = " + kacTeker);
        System.out.println("vitesSayisi = " + vitesSayisi);
        System.out.println("araziTekeri = " + araziTekeri);
        System.out.println("ziliVar = " + ziliVar);

    }
}
