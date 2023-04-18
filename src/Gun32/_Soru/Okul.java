package Gun32._Soru;

import java.util.ArrayList;

public class Okul {
    ArrayList<Ogrenci> ogr = new ArrayList<>();
    private String OkulAd;
    private int kont;

    public ArrayList<Ogrenci> getOgr() {
        return ogr;
    }

    public void setOgr(ArrayList<Ogrenci> ogr) {
        this.ogr = ogr;
    }

    public String getOkulAd() {
        return OkulAd;
    }

    public void setOkulAd(String okulAd) {
        OkulAd = okulAd;
    }

    public int getKont() {
        return kont;
    }

    public void setKont(int kont) {
        if (kont < 3)
            this.kont = kont;
        else
            System.out.println("Kontenjan Dolu");
    }

    public Okul() {
    }

    public Okul( String okulAd, int kont) {
        setOkulAd(okulAd);
        setKont(kont);

    }

    @Override
    public String toString() {
        return "Okul{" +
                "ogr=" + ogr +
                ", OkulAd='" + OkulAd + '\'' +
                ", kont=" + kont +
                '}';
    }
}
