package Gun19;

import java.util.Arrays;
import java.util.Scanner;

public class _09_JavaMethod {
    public static void main(String[] args) {
        // kullanıcıdan 5 elemanlı bir diziyi doldurduktan sonra
        // dizinin en küçük ve en büyük elemanını
        // ve ortalamasını ayrı fonksiyonlarda bulup yazdrınız.


        int dizi[]=new int[5];
        Scanner oku=new Scanner(System.in);

        for (int i = 0; i <5 ; i++) {
            System.out.print(i+ ".Sayı : ");
            dizi[i] = oku.nextInt(); // dizinin elemanlarını okuma işini yaptık

        }

        System.out.println(Arrays.toString(dizi));

        enkucukYaz(dizi);
        enbüyükelemanyazdır(dizi);
        ortalamaYaz(dizi);

    }

    public static void enkucukYaz(int[] sayilar) {
        for (int i = 0; i < sayilar.length; i++) {
            Arrays.sort(sayilar); // küçükten büyüğe sıraladık

        }
        System.out.println("en küçük eleman: "+sayilar[0]);


    }
    public static void enbüyükelemanyazdır(int [] sayilar) {
        for (int i = 0; i < sayilar.length ; i++) {
            Arrays.sort(sayilar);

        }

        System.out.println("en büyük eleman = " + sayilar[sayilar.length-1]);

    }

    public static void ortalamaYaz(int[] sayilar) {
        int toplam = 0;
        int ort = 0;

        for (int i = 0; i < sayilar.length; i++) {
            toplam = toplam + i;
            ort = toplam / 5;


        }

        System.out.println("ort = " + ort);
    }

}
