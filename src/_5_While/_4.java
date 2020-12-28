package _5_While;

public class _4 {
    public static void main(String[] args) {


        int i = -1;

        while (i<=10){
            i++;
            if (i==2){
                continue;
            }
            System.out.println(i);
        }

        System.out.println("-------------------------------------------");



        int a = 0;
        while (a<=10){

            if (a==4){
                break;
            }
            System.out.println(a);
            a++;
        }
    }
}
