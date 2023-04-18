package Gun39._01_OOP_Soru;

public class Kartal extends Hayvan{

    public Kartal(String isim, String dogumtarihi, boolean vahsi) {

        super(isim, dogumtarihi, vahsi);
    }

    @Override
     void yemekmik() {
        System.out.println("günlük 1 kg");

    }

    @Override
     void yiyecek() {
        System.out.println("et");

    }

    @Override
     void uykusüresi() {
        System.out.println("9 saat");

    }

    @Override
     void ses() {
        System.out.println("waaoorrrr");

    }
}
