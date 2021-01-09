package _12_TryCatch;

import java.util.ArrayList;

public class _4 {

    public static void main(String[] args) {

try {
    ArrayList<Integer> arrayList = new ArrayList<>();
    arrayList.add(3);
    arrayList.add(4);
    arrayList.add(5);
    arrayList.add(6);

    for (int i = 0; i <6 ; i++) {
        System.out.println(arrayList.get(i));
    }
}catch (Exception e){
    e.printStackTrace();
}
        System.out.println("Devam");

    }

}
