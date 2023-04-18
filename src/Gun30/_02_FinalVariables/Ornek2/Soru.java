package Gun30._02_FinalVariables.Ornek2;

import java.util.Scanner;

public class Soru {
    public static void main(String[] args) {
        // Sabitler isimli bir Class da sabit bir şekilde
        // bir gündeki saat sayısı, bir saatdaki dakika sayısı ve
        // bir dakikadaki saniye sayısını tanımlayınız.
        // mainde kullanıcıdan gun, saat, dakika alarak toplam
        // saniyeyi bulunuz.

        int day=0;
        Scanner read=new Scanner(System.in);
        System.out.print("Gun giriniz: ");
        day = read.nextInt();

        int hour=0;
        System.out.print("Saat giriniz: ");
        hour= read.nextInt();

        int min=0;
        System.out.print("dakika giriniz: ");
        min = read.nextInt();

        int toplamsaniye=
                (day
                *Sabitler.hoursOfDay
                *Sabitler.minOfHour
                *Sabitler.secOfMin
                +
                hour
                *Sabitler.secOfMin
                *Sabitler.minOfHour
                +
                min
                *Sabitler.secOfMin);

        System.out.println("toplamsaniye = " + toplamsaniye);

            }

}
