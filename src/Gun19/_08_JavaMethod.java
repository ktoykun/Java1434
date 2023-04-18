package Gun19;

import java.util.Arrays;

public class _08_JavaMethod {
    public static void main(String[] args) {
        // mainde 20 elemanlı bir dizi tanımla. sonra bir fonksiyona göndererek
        // elemanlarını 100 e kadar random doldur.ve aynı fonksiyonu yazdırınız.

        int dizi[]=new int[20];
        dizidolduryazdır(dizi);

    }
    public static void dizidolduryazdır (int[] sayilar) {
        for (int i = 0; i <sayilar.length ; i++) {
            sayilar[i] =(int) (Math.random()*100);
        }

        System.out.println("Sayilar = " + Arrays.toString(sayilar));


    }
}
