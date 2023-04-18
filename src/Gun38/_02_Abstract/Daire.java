package Gun38._02_Abstract;

public class Daire extends Sekil {

    private double yarıcap;

    public Daire (double yarıcap) { // bu kontrolden geçmesi için - girmesin diye
        setYarıcap(yarıcap);
    }

    @Override
    double cevre() {
        return (this.yarıcap*2*Math.PI);
    }

    @Override
    double alan() { // ortak olan alan ve cevre yönünü abstract klastan aldık
        return (Math.PI*yarıcap*yarıcap);
    }

    public double getYarıcap() {
        return yarıcap;
    }

    public void setYarıcap(double yarıcap) {
        this.yarıcap = yarıcap;
    }

    @Override
    public String toString() {
        return "Daire{" +
                "yarıcap=" + yarıcap +
                "alan'" + alan()+
                "cevre='" + cevre()+
                '}';
    }
}
