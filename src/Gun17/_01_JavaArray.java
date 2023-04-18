package Gun17;

import java.util.ArrayList;

public class _01_JavaArray {
    public static void main(String[] args) {
        // 50 elemanlı bir dizi tanımlayınız.10 a kadar olan sayılardan random
        // atayarak doldurunuz. farklı bir döngü ile tek olanlara 1 çift
        // olanlara 0 atayınız.

        int[] dizi= new int[50];

        for (int i = 0; i < dizi.length ; i++) {
            dizi[i]= (int) (Math.random()*11); // 10 dahil olsun diye 11 yazdık.

        }

        for (int i = 0; i < dizi.length ; i++) {
            System.out.println("dizi önce = " + dizi[i]);

        }

        for (int i = 0; i < dizi.length ; i++) {
            if (dizi[i] %2 ==0)
                dizi[i]=0;
                    else dizi[i]=1;

        }

        for (int i = 0; i < dizi.length ; i++) {
            System.out.println("dizi sonra = " + dizi[i]);

        }


    }
}
