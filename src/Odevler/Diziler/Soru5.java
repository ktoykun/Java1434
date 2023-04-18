package Odevler.Diziler;

public class Soru5 {
    public static void main(String[] args) {
        //   100 kadar olan sayılardan kaç tanesinin birler basamağının 5 olduğunu bulunuz.

       int sayı = 0;
       int sayac = 0;

        while (sayı <=100) {
            if (sayı % 10 == 5){
                sayac++;
        }
            sayı++;
        }

        System.out.println("sayac = " + sayac);



    }
}



