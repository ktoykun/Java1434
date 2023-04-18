package Gun19;

public class _06_JavaMethod {
    public static void main(String[] args) {
        MerhabaYaz();
        IsmeMerhaba("Kübra"); // şimdi burada parantez içine yazdığımız
        // şeyin aşağıdaki metodun parantez içinde tanımlı olması gerekir.
        // boş olmaz.

        cokMerhabaYaz(5); // aşağıda buna int tanımladık. miktarı kadar merhaba yazdırdık.
        // bu parantez için parametre tanımlaması şart.

    }

    public static void MerhabaYaz (){
        System.out.println("Merhaba dünya");
        System.out.println("Merhaba dünya");


    }

    public static void IsmeMerhaba (String isim){ // burada parantez içi değişkeni tanımladık
        // yukarıda çağıdığımızda yabancı olmasın diye. string int double her şey olabilir.
        System.out.println(isim + " Merhaba ");


    }

    public static void cokMerhabaYaz (int miktar){
        for (int i = 0; i <miktar ; i++) {
            System.out.println(" merhaba");

        }

}}
