package _12_TryCatch;

public class _3 {

    public static void main(String[] args) {

try {
    String a = "Techno Study";
    String yeniString = a.substring(13);
    System.out.println(yeniString.indexOf(1));
}catch (Exception e){
   // System.out.println(e.getMessage());
    e.printStackTrace();
}


        System.out.println("Devam");
    }
}
