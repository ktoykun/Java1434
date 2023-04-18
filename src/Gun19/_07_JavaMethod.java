package Gun19;

import java.util.Scanner;

public class _07_JavaMethod {
    public static void main(String[] args) {

        tekMiCiftMi(55);
        tekMiCiftMi(78);
        tekMiCiftMiOku();

    }

    public static void tekMiCiftMi(int sayi) {
        if (sayi%2 ==0)
            System.out.println("çift");
        else
            System.out.println("tek");

    }
    public static void tekMiCiftMiOku() {
        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayi= oku.nextInt();

        tekMiCiftMi(sayi); // gördüğün gibi yukarıdaki metoddan çağırdık.
        // demek ki metoddan metodu çapırabiliyoruz.


    }



}
