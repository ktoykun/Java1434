package Gun25;

// class-tiplerin tanımlandığı yer

public class _01_JavaClassAndObject {

    public _01_JavaClassAndObject() {
    }

    // metodların yazıldığı yer
    public static void main(String[] args) { // başla

        // ana programın başladığı ve çalıştığı yer

        Araba benimArabam=new Araba(); // araba tür, tip adı. benim arabam ise nesne
        benimArabam.marka="Tesla";
        benimArabam.model="new";
        benimArabam.motorhacmi=1600;
        benimArabam.yıl=2022;
        benimArabam.renk="siyah";

        System.out.println("benimArabam.motorhacmi = " + benimArabam.motorhacmi);
        System.out.println("benimArabam.renk = " + benimArabam.renk);
        System.out.println("benimArabam.model = " + benimArabam.model);
        System.out.println("benimArabam.marka = " + benimArabam.marka);
        System.out.println("benimArabam.yıl = " + benimArabam.yıl);

    } // dur

    // metodların yazıldığı yer
}

// tiplerin (classların) tanımlandığı yer
// yeni tip olduğunu belirtmek için başına class yazıyoruz.

class Araba {  // araba artık string gibi int gibi yeni bir tip.
    // içine ister int, ister string özellik tanımla
    String renk;
    String model;
    String marka;
    int yıl;
    int motorhacmi;


}
