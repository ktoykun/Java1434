package Gun21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _02_ArrayList_Soru {
    public static void main(String[] args) {
        // kullanıcıdan alacağınız 6 elemanlı bir dizinin
        // sadece tek sayı olan elemanlarını ayrı diziye atarak
        // yazdırınız.

        int [] dizi=new int[6];
        Scanner read=new Scanner(System.in);

        for (int i = 0; i < dizi.length ; i++) {
            System.out.print(i + " .sayı");
            dizi [i]= read.nextInt();

        }
        // diziyi yazdırma işlemi arrays to string
        System.out.println("dizi = " + Arrays.toString(dizi));

        // array liste atma işlemi şöyle:
        ArrayList<Integer> teksayıları=new ArrayList<>();
        for (int i = 0; i < dizi.length ; i++) {
            if (dizi[i] % 2 !=0)
                teksayıları.add(dizi[i]);

        }

        System.out.println("teksayıları = " + teksayıları);

        // 2. yöntem
        for (int i = 0; i < dizi.length ; i++) {
            System.out.println("Sayı= ");
            dizi[i]= read.nextInt();

            if (dizi[i] %2 !=0)
                teksayıları.add( dizi[i] );

        }


    }
}
