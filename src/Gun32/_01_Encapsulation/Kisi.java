package Gun32._01_Encapsulation;

public class Kisi { // normal programlama yapılırken hepsi
    // private yapılır
    private String ad;
    private String soyad;
    private int yas; //direk erişimi
    // kapatıp korumaya aldık

    void YasAta(int yas) {
        if (yas > 0 && yas < 100)
            this.yas = yas;
        else
            System.out.println("Hatalı Girdiniz");

    }

    int yasVer(){
        return this.yas;
    }

    void setAd(String ad){
        if (ad.length()<25 )
            this.ad=ad;
        else
            System.out.println("Hatalı giriş");
    }

    String getAd() { return this.ad;}

    void setSoyad(String soyad)
    {
        if (soyad.length()<25)
            this.soyad=soyad;
        else
            System.out.println("Hatalı Giriş");

    }

    String getSoyad() { return this.soyad; }

    @Override  // to string yazdırmak için
    public String toString() {
        return "Kisi{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yas=" + yas +
                '}';
    }
}
