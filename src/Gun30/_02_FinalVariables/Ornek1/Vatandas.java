package Gun30._02_FinalVariables.Ornek1;

public class Vatandas {
    String isim;

    final int tcNo; // başına final dersek
    // o artık değiştirilemez bir sayı oluyor.

    static int tcNoSayac=1;

    public Vatandas(String isim) {
        this.isim = isim;
        this.tcNo = tcNoSayac++;
    }

    @Override
    public String toString() {
        return "Vatandas{" +
                "isim='" + isim + '\'' +
                ", tcNo=" + tcNo +
                '}';
    }
}
