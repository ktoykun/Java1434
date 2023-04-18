package Gun43;

import java.util.Scanner;

public class _02_JavaRunTimeException {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);

        for (int i = 0; i < 3; i++) {


        try { // hatayı kontrol altına almamız lazım.
            // o sebeple hata bölgesini böyle parantez içine alıyoruz.
            System.out.println("Sayı1=");
            int sayı1= oku.nextInt();

            System.out.println("Sayı2=");
            int sayı2= oku.nextInt();

            int bolum=sayı1/sayı2;
            System.out.println("bolum = " + bolum);

        }
        catch (Exception hata) { // sonra bütün hataları bu bölgede topluyor.
            // hata isimli exception değişkenine bu hataları attık.
            System.out.println("hata = " + hata.getMessage());
            System.out.println("Lütfen tekrar deneyiniz: ");
            i--;
        }

        }
        System.out.println("program bitti");
    }
}
