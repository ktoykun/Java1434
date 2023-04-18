package Odevler._04_12_2DArrays;

public class _Odev_2D_Soru2 {
    public static void main(String[] args) {

        /*
        Şu şekilde olan bir 2D int Array'i oluşturunuz.  [{5,2,1} , {10,2,3,6} , {1,2}] )
        2D array'de olan elemanları toplayınız. toplamı yazdırınız. (Sonuç 32 olmalıdır.
         */

        int dizi [][]={{5,2,1}, {10,2,3,6}, {1,2}};
        int toplam=0;

        for (int i = 0; i < dizi.length ; i++) {
            for (int j = 0; j <dizi[i].length ; j++) {
                toplam=toplam+dizi[i][j];
            }

        }

        System.out.println(toplam);
    }
}
