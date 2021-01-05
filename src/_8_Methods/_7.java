package _8_Methods;

public class _7 {
    /*
    websitem    isminde bir publc static void method oluşturun.
    Parametre almasın.

    www.technostudy.com yazdırsın.

     */
    public static void Websitem() {
        System.out.println("www.technostudy.com");
    }

    public static void deparment(String a){

        if (a.equalsIgnoreCase("QA")){
            System.out.println("QA DEPARTMENT");
        }else if (a.equalsIgnoreCase("Security")){
            System.out.println("SECURİTY DEPARTMENT");
        }
        else if (a.equalsIgnoreCase("Back end Developer")){

            System.out.println("BACKEND DEVELOPER");
        }
    }

    public static void main(String[] args) {
        Websitem();
        deparment("security");
        Websitem();

}
}
