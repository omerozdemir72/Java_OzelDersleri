package _15_Interface.dataBase;

public class mainClass {
    public static void main(String[] args) {

        ogrenci student = new ogrenci();
        IDataBase ogrenci = new ogrenci();
        calisan employee = new calisan();

        student.hesapAcma();
        employee.hesapAcma();
        ogrenci.hesapAcma();

    }
}
