package Gun23;

import java.util.ArrayList;
import java.util.HashSet;

public class _01_HashSet {
        public static void main(String[] args) {
            int sayi=5; // hafuzada 1 sayı saklıyor
            int [] dizi=new int[3];// hafızada 3 sayı saklar, sabit boyutlu
            int [] [] tablo=new int[2][4]; // hafızada 8 sayı saklıyor. 2x4

            // dizi lazım ama  boyutu gittikçe artsın. sildikçe azalsın.

            ArrayList<Integer> liste=new ArrayList<>(); // boyu değişken
            ArrayList<ArrayList<Integer>> Listelerinlistesi=new ArrayList<>();
            // 2 boyutlu 2 boyutuda değişken


            // bu hashset denen şey hem dizi gibidir (arraylist gibi) hem de
            // tekrar değerleri almadan çalışır.
            // Hashset: sen ekledikçe hızlı çalışmak için kendine göre bir sıralamada elemanları tutar.
            //LinkedHashSet: sen ekledikçe EKLENME SIRASINA GÖRE elemanları saklar.
            //TreeSet: sen ekledikçe onları her zaman SIRALI tutar.
            //BUNLARIN ORTAK ÖZELLİĞİ HİÇ TEKRAT ETMEZ. ID gibi düşünelim.


            HashSet<Integer> hs1 =new HashSet<>(); // hızlı çalışmasıyla ünlü.tekrar ifade yok. sıralaması da kafasına göre.
            hs1.add(1);
            hs1.add(2);
            hs1.add(5);
            hs1.add(13);
            boolean eklendiMi=hs1.add(8);
            boolean tekrareklendimi=hs1.add(5);
            hs1.add(2);

            System.out.println("hs1 = " + hs1);
            System.out.println("tekrareklendimi = " + tekrareklendimi);
            System.out.println("eklendiMi = " + eklendiMi);



        }}


