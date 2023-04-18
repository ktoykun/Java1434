package Gun32._02_Encapsulation;

public class ArabaMain {
    public static void main(String[] args) {
        // bir araba nesnesi oluşturulacak
        // bu nesnenin verilerini OOP kurallarına uygun olarak verip alınır
        // main de bir nesne oluşturup bunu kontrol ediniz.
        Araba arb=new Araba();
        arb.setModel(2022);
        arb.setKapısayısı(5);
        arb.setRenk("siyah");
        arb.setMotorhacmi(1600);
        System.out.println("arb = " + arb);

        Araba arb2=new Araba(1970, "volvo", "kırmızı", 1500, 4);
        System.out.println(arb2);
    }}
