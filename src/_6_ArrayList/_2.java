package _6_ArrayList;

import java.util.ArrayList;

public class _2 {
    public static void main(String[] args) {
/*
Kesişim elemanlarını silme methodu
REmoveAll
 */

        ArrayList<String> a = new ArrayList<>();


        a.add("A");
        a.add("B");
        a.add("C");
        a.add("D");

        System.out.println("a : " +a);

        ArrayList<String> b= new ArrayList<>();

        b.add("C");
        b.add("D");
        b.add("E");
        b.add("F");
        System.out.println("b : " +b);


        a.removeAll(b);
        System.out.println(a);

    }
}
