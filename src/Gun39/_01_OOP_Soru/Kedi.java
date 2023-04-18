package Gun39._01_OOP_Soru;

public class Kedi extends Hayvan{
    public Kedi(String isim, String dogumtarihi, boolean vahsi) {
        super(isim, dogumtarihi, vahsi);
    }

    @Override
    public void yemekmik() {
        System.out.println("günlük 500 gr");

    }

    @Override
    public void yiyecek() {
        System.out.println("yaş mama");

    }

    @Override
    public void uykusüresi() {
        System.out.println("5 saat");

    }


    @Override
    public void ses() {
        System.out.println("miaaoooww");

    }
}
