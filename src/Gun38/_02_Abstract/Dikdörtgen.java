package Gun38._02_Abstract;

public class Dikdörtgen extends Sekil{ // ortak olan alan ve cevre yönünü abstract klastan aldık
    // bunu doldurmamız lazım.

    private double kısakenar;
    private double uzunkenar;

    public Dikdörtgen(double kısakenar, double uzunkenar) { // bu kontrolden geçmesi için - girmesin diye
        setKısakenar(kısakenar);
        setUzunkenar(uzunkenar);
    }

    @Override
    double alan() {
        return (this.kısakenar*this.uzunkenar);
    }

    @Override
    double cevre() {
        return ((this.kısakenar+this.uzunkenar)*2);
    }

    public double getKısakenar() {
        return kısakenar;
    }

    public void setKısakenar(double kısakenar) {
        this.kısakenar = kısakenar;
    }

    public double getUzunkenar() {
        return uzunkenar;
    }

    public void setUzunkenar(double uzunkenar) {
        this.uzunkenar = uzunkenar;
    }
}
