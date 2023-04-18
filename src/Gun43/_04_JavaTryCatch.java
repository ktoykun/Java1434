package Gun43;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _04_JavaTryCatch { // peki birden fazla hata çeşidini nasıl kontrol ederiz
    // kulanıcı sayı girmesi gerekirsen harf girerse veya bölüm yerine 0 girerse gibi
    public static void main(String[] args) {

        try {
            System.out.println("Sayı1=");

            Scanner oku=new Scanner(System.in);
            int sayı1= oku.nextInt();

            System.out.println("Sayı2=");
            int sayı2= oku.nextInt();

            int bolum=sayı1/sayı2;
            System.out.println("bolum = " + bolum);

        }
        catch (InputMismatchException ex){
            System.out.println("Lütfen Sayı giriniz: ");
        }
        catch (ArithmeticException ex){
            System.out.println("Sayı sıfıra bölünemez");
        }
        catch (Exception ex){ // kalan hatalar burada
            System.out.println("Hata oluştur"+ex.getMessage());
        }
        System.out.println("Program bitti");
}

}
