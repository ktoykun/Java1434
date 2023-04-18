package Odevler.Diziler;

import java.util.Scanner;

public class Soru6 {
    public static void main(String[] args) {
        // Bir sayı bulmaca oyunu yapılmak isteniyor.
        // Bilgisayar 10-20 arasında bir sayı tutsun, kullanıcı bu sayıyı bulmaya çalışssın.
        // Kullanıcının bu sayıyı bulmak için 3 hakkı olsun.
        // 3 hakkın sonunda da bilemez ise bilemediniz yazıp tutulan sayıyı bildirsin.
        // Eğer bilirse tebrikler yazsın.

        Scanner oku = new Scanner(System.in);
        int sayi = (int) (Math.random() * (20 - 10)) + 10;
        int sayac = 1;
        int tahmin;

        do {System.out.println(sayac + " . tahmininiz = ");
            tahmin = oku.nextInt();
            if (tahmin == sayi)
            {System.out.println("Tebrikler");
                break;}
                else if (tahmin != sayi && sayac != 3)
                { System.out.println("bilemediniz!");}
                 else {System.out.println("Bilemediniz tutulan sayı = " + sayi);}
                  sayac++;}

            while (sayac <= 3) ;

    }}
