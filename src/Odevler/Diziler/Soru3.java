package Odevler.Diziler;

import java.util.Scanner;

public class Soru3 {
    public static void main(String[] args) {
        //  Kullanıcnın gireceği bir sayıya kadar olan sayıların toplamını bulunuz.

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayi= oku.nextInt();
        int toplam=0;
        int sayac=0;

        while (sayac<=sayi){
            toplam=sayac+sayi;
            sayac++;
        }

        System.out.println("toplam = " + toplam);

    }
}
