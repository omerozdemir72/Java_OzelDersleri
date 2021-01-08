package _11_Encapsulation.soru2;

public class mainClass {
    public static void main(String[] args) {

        /*
       bilgi classındaki değerleri burada cagırın.

         */bilgi bilgi = new bilgi();
        bilgi.setIsim("ali");
        bilgi.setSoyisim("akıncıoglu");

        System.out.println(bilgi.getIsim());
        System.out.println(bilgi.getSoyisim());
    }
}
