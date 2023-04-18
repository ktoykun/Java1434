package Odevler.Diziler;

public class OdevDizilerSoru3 {
    public static void main(String[] args) {
        // İnt Array oluştur ve elemanları   : 25,30,30,35,100
        // Array in elemanlarının toplamını yazdır.

        int [] dizi={25,30,30,35,100 };
        int toplam=0;
        for (int i = 0; i < dizi.length ; i++) {
            toplam=toplam+dizi[i];

        }

        System.out.println("toplam = " + toplam);



    }
}
