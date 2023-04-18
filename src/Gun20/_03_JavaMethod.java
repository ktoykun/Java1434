package Gun20;

import java.util.Scanner;

public class _03_JavaMethod {
    public static void main(String[] args) {
        // kullanıcının gireceği bir sayıya kadar olan sayıların carpımını
        //(faktöriyel) bir fonksiyonda buldurup bunun sonucunu main de
        // tek mi cift mi olduğunu yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("sayı giriniz: ");
        int sayı= oku.nextInt();

        int faktöriyel=faktöriyel(sayı);
        System.out.println("carpim = " + faktöriyel);

        if (faktöriyel % 2 == 0)
            System.out.println("çift");
        else
            System.out.println("tek");

    }

    public static int faktöriyel (int sayı) {
       int fak = 1;
       for (int i = 1; i < sayı; i++) {
           fak= fak * i;

        }

        return fak;
    }


}
