package Gun20;

import java.util.Scanner;

public class _04_JavaMethod {
    public static void main(String[] args) {
        // kullanıcının gireceği 2 sayının toplamını
        // bir fonksiyonda buldurup sonucu mainde yazdırınız.

        Scanner oku=new Scanner(System.in);

        System.out.println("1. sayı giriniz");
        int sayi1= oku.nextInt();

        System.out.println("2. sayı giriniz");
        int sayi2= oku.nextInt();

        int toplam= toplam(sayi1, sayi2);
        System.out.println("toplam = " + toplam);

    }

    public static int toplam (int sayi1, int sayi2 ){
        int toplam=sayi2+sayi1;
        return toplam;

        // bunun yerine " return (sayi1+sayi2); " de yazabiliriz. aynı şey.
    }
}
