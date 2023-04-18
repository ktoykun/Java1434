package Gun20;

import java.util.Scanner;

public class _02_JavaMethod {
    public static void main(String[] args) {
        // Kullanıcının gireceği 2 sayıdan büyük olanını bulma işlemini
        // bir metodda yaptıktan sonra mainde yazdırınız.

        Scanner oku=new Scanner(System.in);

        System.out.print("1. Sayı giriniz: ");
        int sayi1= oku.nextInt();

        System.out.print("2. Sayı giriniz: ");
        int sayi2= oku.nextInt();

        int enb= enb(sayi1, sayi2);
        System.out.println("enb = " + enb);

    }

    public static int enb (int s1, int s2){
        int donecek=0;
        if ( s1<s2)
            donecek=s2;
        else
            donecek=s1;

        // bunun sonucunu mainde yazdırmka için buradan oraya bir şey göndermeli.
        return donecek;

        // 2. yöntem

      //  return s1<s2 ? s2 : s1;

        // 3. ve en güzel yöntem

       // if (s1<s2)
      //      return s1;
     //   else
       //     return s2;
    }
}
