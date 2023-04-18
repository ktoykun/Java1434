package Gun22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _01_ArrayList {
    public static void main(String[] args) {
        // array list Collection grubunun bir elemanıdır.
        // Array'i sıralarken Array.sort u kullandığımız gibi
        // Arraylist i sıralarken de Collection metodlarını kullanacağız.

        ArrayList<Integer> sayılar=new ArrayList<>();
        sayılar.add(10);
        sayılar.add(452);
        sayılar.add(25);
        sayılar.add(124);

        System.out.println("sayılar = " + sayılar);

        // sıralama işlemi.
        Collections.sort(sayılar);
        System.out.println("sayılar = " + sayılar);

        // tersine çevirme
        Collections.reverse(sayılar);
        System.out.println("sayılar = " + sayılar);
        
        // max ve min eleman bulma
        System.out.println("Collections.max(sayılar) = " + Collections.max(sayılar));
        System.out.println("Collections.min(sayılar) = " + Collections.min(sayılar));

        // bütün elemanları set etme
        Collections.fill(sayılar, 1); // sayıların hepsini 1 ile doldurdu
        System.out.println("sayılar = " + sayılar);

        // replace
        Collections.replaceAll(sayılar, 0 , 6); // 0 lara 6 ata
        System.out.println("sayılar = " + sayılar);

        // tanımlarken değer atama
        int [] dizi={2,3,4}; // bu dizilerde nasıl yaptığımız. aşağıdaki de array list örneği
        ArrayList<Integer> liste=new ArrayList<>(Arrays.asList(3,4,5,6));
        ArrayList<String> StrListe=new ArrayList<>(Arrays.asList("kübra", "osman"));

        // diziyi, array liste nasıl atarız
        Integer [] dizi2={2,3,34};
        ArrayList<Integer> list2=new ArrayList<>( Arrays.asList(dizi2)  );
        System.out.println("list2 = " + list2);

        // ara not. int >> sadece sayı saklayabilen basit tip
        // Integer ise >> hem sayı saklar hem kendine özgü metodları saklar


    }
}
