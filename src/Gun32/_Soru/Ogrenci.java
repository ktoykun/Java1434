package Gun32._Soru;

public class Ogrenci {


    public Ogrenci() {
    }


    public Ogrenci(int ID) {
        this.ID = ID;
    }


    private int ID;
    private int yas;
    private String ad;
    private String soyad;

    static int sayacID(){

    return sayacID();
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if (yas>15)
        this.yas = yas;
        else
            System.out.println("Ekleme Yapılamaz. Yeni Ogr Giriniz");
    }

    public Ogrenci(String ad, String soyad, int yas) {

        setYas(yas);
        setAd(ad);
        setSoyad(soyad);

       // this.ad = ad;
        // this.soyad = soyad;
        // this.yas = yas;

    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "yas=" + yas +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                '}';
    }
}
