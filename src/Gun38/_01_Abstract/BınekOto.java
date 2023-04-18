package Gun38._01_Abstract;
// abstract klass: 2'si bir arada=1 interface + 1 parent class

public abstract class BınekOto { // başına abstarct ekledikki implement
    // edilecek bir şey olduğunu bilsin.

    //Burası parent class
    private String marka;
    private int Uretimyılı;
    private int vitessayısı;

    public BınekOto(String marka, int uretimyılı, int bitesayısı) {
        setMarka(marka);
        setUretimyılı(uretimyılı);
        setBitesayısı(vitessayısı);     }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getUretimyılı() {
        return Uretimyılı;
    }

    public void setUretimyılı(int uretimyılı) {
        Uretimyılı = uretimyılı;
    }

    public int getBitesayısı() {
        return vitessayısı;
    }

    public void setBitesayısı(int bitesayısı) {
        this.vitessayısı = bitesayısı;
    }

    @Override
    public String toString() {
        return "BınekOto{" +
                "marka='" + marka + '\'' +
                ", Uretimyılı=" + Uretimyılı +
                ", vitessayısı=" + vitessayısı +
                '}';
    }

    abstract int hızlanmasuresi(); // başında bir abstarct
    // metodu ile buraya aldık.
}
