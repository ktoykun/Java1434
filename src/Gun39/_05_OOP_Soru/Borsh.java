package Gun39._05_OOP_Soru;

public class Borsh implements Food {
    void boil(){
        System.out.println("Özenle haşlandı ");

    }

    void eatTomorrow (){
        System.out.println("Yarına hazır");

    }

    @Override
    public void taste() {
        System.out.println("En taze sebzeler kullanıldı");

    }

    @Override
    public double ücret() {
        return 33;
    }
}
