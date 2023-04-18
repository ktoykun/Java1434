package Odevler.WhileDoWhileForBreakContinueOdev;

import java.util.Scanner;

public class Odev {
    public static <String> void main(String[] args) {
        //1- Kullanıcının gireceği 20 sayıdan tek olanlarının toplamını bulunuz

        Scanner oku=new Scanner(System.in);
        int sayac=1;
        int toplam=0;

        while (sayac <=20){
            System.out.print(sayac+".Sayı giriniz: ");
            int sayi=oku.nextInt();
            if (sayi%2 !=0) {
                toplam+=sayi;}

            sayac++;

        }
        System.out.println(sayac+"toplam = " + toplam);


    }
}


