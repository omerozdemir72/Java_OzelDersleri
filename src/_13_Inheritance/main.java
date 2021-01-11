package _13_Inheritance;

public class main {
    public static void main(String[] args) {

        bisiklet bisiklet= new bisiklet("Siyah",2,1.6,true);

       // System.out.println(bisiklet.toString());
       bisiklet.info();
        System.out.println("----------------------------------------");

       dagBisikleti dagBisikleti = new dagBisikleti("sarı",2,1.2,false,24,true);

dagBisikleti.infoDagBisikleti();

        System.out.println("----------------------------------------");


        elektrikliBisiklet elektrikliBisiklet= new elektrikliBisiklet("kırmızı",3,1.5,true,25,true);

        elektrikliBisiklet.infoElektrikli();




    }
}
