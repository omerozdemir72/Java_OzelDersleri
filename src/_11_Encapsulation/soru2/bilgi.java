package _11_Encapsulation.soru2;

public class bilgi {
    private String isim;
    private String soyisim;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;

        if (soyisim.length() > 6) {
            System.out.println("Gecersiz soyisim");
        }

    }
}
