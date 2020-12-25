package _1_StringMethodlar;

public class odev_cozumu {

    public static void main(String[] args) {


        // String gun = "Bugün günlerden pazartesi";
        // Verilen günü 'salı' olarak değiştirin ve yeni bir Stringe atayın
        // String gun 1 = "Bugün günlerden Salı"

        String gun = "Bugün günlerden pazartesi";
        String yeni =gun.replaceAll("pazartesi","salı");
        System.out.println(yeni);
    }
}
