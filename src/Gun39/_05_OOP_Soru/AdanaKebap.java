package Gun39._05_OOP_Soru;

public class AdanaKebap implements Food {

    void marinade() {
        System.out.println("Et özenle marine edildi");
    }

    void grill(){
        System.out.println("Odun ateşinde özenle pişirildi");

    }

    @Override
    public void taste() {
        System.out.println("Enfes baharatlar eklendi");

    }

    @Override
    public double ücret() {
        return 55;
    }
}
