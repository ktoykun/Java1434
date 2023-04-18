package Gun39._05_OOP_Soru;

public class Palov implements Food {
    void fry(){
        System.out.println("Kızartma işlemi gerçekleşti");

    }

    void boil (){
        System.out.println("Pilav özenle haşlandı");

    }

    @Override
    public void taste() {
        System.out.println("tadı enfes oldu");

    }

    @Override
    public double ücret() {
        return 44;
    }
}
