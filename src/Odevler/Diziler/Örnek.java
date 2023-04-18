package Odevler.Diziler;

import java.util.Scanner;

public class Örnek {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sayi = (int)(Math.random() * (20 -10)) + 10;
        int sayac = 1;
        int tahminSayi;
        do {System.out.print(sayac + ". tahmininiz nedir: ");
            tahminSayi = input.nextInt();
            if(tahminSayi == sayi){ System.out.println("TEBRİKLER");
                break; }else if(tahminSayi != sayi && sayac != 3)
                { System.out.println("bilemediniz tekrar deneyin");
                }else{ System.out.println("Bilemediniz tutulan sayı -> " + sayi); }
            sayac++; }
        while (sayac <= 3);
    }
}
