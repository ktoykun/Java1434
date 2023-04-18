package Gun19;

import java.util.Arrays;
import java.util.Scanner;

public class _03_Java2DArrays {
    public static void main(String[] args) {
        // 3x2 lik bir diziyi kullanıcıdan sayı alarak doldur.
        // tek elemanlarını tek boyutlu bir diziye ata.

        Scanner oku=new Scanner(System.in);
        int dizi[][]=new int[3][2];
        int tekmiktar=0;


        for (int i = 0; i <dizi.length ; i++) {
            for (int j = 0; j <dizi[i].length ; j++) {
                System.out.print("Sayı giriniz : ");
                dizi[i][j] = oku.nextInt();

                if (dizi[i][j] %2 ==1)
                    tekmiktar++; // teklerin sayısını bulduk.
            }

        }

        int [] teklerdizisi=new int[tekmiktar]; // teklerin miktarı kadar bir dizi tanımlandı. yukarıdaki
        // teklerin sayısı kadar bu döngüde oda açtık. boyutunu ayarladık yani.
        tekmiktar=0; // bu hangi odaya atacağını söylüyor. 0 a eşitledik ki ilk odadan başlasın.
        // tek geldikçe odaya atıyor ve bir artıyor.

        for (int i = 0; i < dizi.length ; i++) {
            for (int j = 0; j <dizi[i].length ; j++) {

                if (dizi[i][j]%2 !=0) {
                   teklerdizisi[tekmiktar]=dizi[i][j];
                    tekmiktar++;

                }

            }


        }

        System.out.println(Arrays.toString(teklerdizisi));


    }
}
