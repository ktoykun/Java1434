package Gun23;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class _05_Soru {

        public static void main(String[] args) {
            // 10 elamanlı bir diziyi random(10(dahil) a kadar olan sayılarla
            // doldurduktan, tekrarlı değerleri almayacak şekilde yeni bir
            // diziye atınız.


            Integer dizi []=new Integer[10]; // 2. yöntem ile tipi aynı olsun diye bunu int değil, Integer yaptık.
            Random rnd=new Random();

            for (int i = 0; i < dizi.length ; i++) {
                dizi [i]=(int) (Math.random()*11); // 10 dahil dediği için 11
            }
            System.out.println("dizi = " + Arrays.toString(dizi));

            // 1. yöntem
            HashSet<Integer> hs=new HashSet<>();
            for (int i = 0; i < dizi.length ; i++) {
                hs.add(dizi[i]); }

            System.out.println("hs = " + hs);

            // 2. yöntem

            HashSet<Integer> hs2=new HashSet<>(Arrays.asList(dizi));
            System.out.println("hs2 = " + hs2);

        }
    }


