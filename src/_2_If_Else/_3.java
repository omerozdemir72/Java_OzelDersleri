package _2_If_Else;

import java.util.Scanner;

public class _3 {
    public static void main(String[] args) {

/*
else -if nedir ?


 */

        Scanner sc = new Scanner(System.in);


        System.out.print("not gir : ");

        int not = sc.nextInt();

            if (not>=90) {
                System.out.println("AA");

            } else if (not>=80){
                System.out.println("BB");
            }
           if (not>=70){
                System.out.println("CC");
            }
            else
                System.out.println("Kaldınız.");

    }
}
