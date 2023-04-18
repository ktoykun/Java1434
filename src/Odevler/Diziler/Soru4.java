package Odevler.Diziler;

import java.util.Scanner;
public class Soru4 {
    public static void main(String[] args) {
//  Kullanıcının gireceği 20 sayıdan 10 ile 30 arasındakilerinin toplamını bulunuz

        Scanner oku=new Scanner(System.in);

        int sayac=1;
        int toplam=0;

        while (sayac<20) {
            System.out.print(sayac+".Sayı giriniz: ");
            int sayi=oku.nextInt();
            sayac++;
            if (sayi>20 && sayi<30){
            toplam=toplam+sayi;}

        }

        System.out.println("toplam = " + toplam);

    }
}
