package Gun32._02_Encapsulation;

public class Araba {

    public Araba() {
    }

    private int model;
    private String renk;
    private double motorhacmi;
    private int kapısayısı;


    public void setModel(int model) {
        if (model <1980)
            System.out.println("Hatalı giriş");
        else
        this.model = model;
    }

    public int getModel() {
        return model;
    }
       public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public double getMotorhacmi() {
        return motorhacmi;
    }

    public void setMotorhacmi(double motorhacmi) {
        this.motorhacmi = motorhacmi;
    }

    public int getKapısayısı() {
        return kapısayısı;
    }

    public void setKapısayısı(int kapısayısı) {
        if (kapısayısı<7)
        this.kapısayısı = kapısayısı;
        else
            System.out.println("Hatalı kapı sayısı");
    }

    @Override
    public String toString() {
        return "Araba{" +
                "model=" + model +
                ", renk='" + renk + '\'' +
                ", motorhacmi=" + motorhacmi +
                ", kapısayısı=" + kapısayısı +
                '}';
    }

    public Araba(int model, String marka, String renk, double motorhacmi, int kapısayısı) {
      setModel(model);
      setKapısayısı(kapısayısı);
      setMotorhacmi(motorhacmi);
      setRenk(renk);

        // this.model = model;
        // this.renk = renk;
        // this.motorhacmi = motorhacmi;
        // this.kapısayısı = kapısayısı;
    }
}