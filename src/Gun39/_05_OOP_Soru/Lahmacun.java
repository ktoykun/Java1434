package Gun39._05_OOP_Soru;

public class Lahmacun implements Food {
   void dough(){
    System.out.println("Hamur özenle hazırlandı");
    }
    void addMeat (){
     System.out.println("Harika kıymalar eklendi");

    }
    void bake(){
     System.out.println("Odun ateşinde pişirildi");

    }


    @Override
    public void taste() {
     System.out.println("Domates sosu bile var");

    }

    @Override
    public double ücret() {
        return 33;
    }
}
