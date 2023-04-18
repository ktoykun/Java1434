package Gun38._01_Abstract;

public class OtoMain {
    public static void main(String[] args) {
        Ford fr=new Ford("Porsche", 2002, 6);
        System.out.println("fr = " + fr);

        //  IBınekOto ib=new IBınekOto(); Not: interfacelerden nesne oluşturulamaz.
        //  sadece refereans tip alınabilir. çünkü içi boş dolu değil.
        //  BınekOto bo=new BınekOto("porsche",2022, 3 ); abstractlardan nesne oluşturulamaz
        //  sadece refereans tipalınabilir. çünkü içi boş dolu değil.


    }

}
