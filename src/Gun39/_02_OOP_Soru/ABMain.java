package Gun39._02_OOP_Soru;

public class ABMain {
    public static void main(String[] args) {
        A a=new A();
        System.out.println("A.mesaj" + A.mesaj);

        B b=new B(); // constuctor calıstı.
        System.out.println("B.mesaj = " + B.mesaj);

        A a2=new A(); // bunu değiştiren bir etki yok. en son cons. çalıştı yine B'den merhaba yazar.
        // A'dan mesaj artık B'den merhaba oldu. yeniden nesne oluşturmadık.
        System.out.println("A.mesaj = " + A.mesaj);

        // static değişkenlere class üzerinden mi yoksa nesne üzerinden mı gidilir.?
        // class üzerinden gidilir.
    }
}
