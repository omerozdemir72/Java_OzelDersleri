package _12_TryCatch;

import java.util.NoSuchElementException;

public class _2_ {
    public static void main(String[] args) {

try {
    int [] a = {1,2,3,4,5};
    a[7]=6;
}catch (Exception e){
    System.out.println("Hata 1 : " + e);
}

finally {
    System.out.println("Finally");
}


        System.out.println("Kod devam ediyor");


    }
}
