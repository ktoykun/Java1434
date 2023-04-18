package Odevler.Diziler;

import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {

        //Kullanıcnın gireceği 20 sayıdan kaç tanesinin tek olduğunu bulunuz

        Scanner oku=new Scanner(System.in);
        int s1=1;
        int s2=0;
        while (s1 <=20) {
            System.out.print(s1+ ".Sayı giriniz: ");
            int sayi= oku.nextInt();
            if (sayi %2 !=0)
            {s2++;}

            s1++; }

        System.out.println("sayac2 = " + s2);
        }


}
