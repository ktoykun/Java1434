package Odevler.Diziler;

public class OdevDizilerSoru7 {
    public static void main(String[] args) {
        // int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4
        // Array'in ortalamasını alınız.

        int toplam=0;
        int ort;
        int dizi[]={12,14,21,23,10,4};

        for (int i = 0; i < dizi.length ; i++) {
            toplam=toplam+dizi[i];


        }

        ort=toplam/dizi.length;

        System.out.println("ort = " + ort);


    }
}
