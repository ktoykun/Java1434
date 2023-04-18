package Gun22;

import java.util.ArrayList;

public class _02_Java2DArrayList {
    public static void main(String[] args) {
        int sayi=2; // tek bir rakam tutan değişken
        int [] dizi=new int[4]; // 4 adet sayı saklayanilen bir değişken
        int [] [] tablo=new int[2][3]; //2x3 lük sayı saklayabilen sabit uzunluklu
        ArrayList<Integer> liste=new ArrayList<>(); // uzunluğu değişen bir dizi

        // 20 kişilik bir sınıfta
        // 3 tane ders alan öğrencilerin notlarını
        // nasıl bir değişkende saklayabiliriz

        ArrayList<Integer> matnorları=new ArrayList<>();
        ArrayList<Integer> fiziknorları=new ArrayList<>();
        ArrayList<Integer> kimyanorları=new ArrayList<>();

        matnorları.add(50);
        matnorları.add(45);

        fiziknorları.add(75);
        fiziknorları.add(85);
        fiziknorları.add(24);

        kimyanorları.add(66);
        kimyanorları.add(44);
        kimyanorları.add(35);
        kimyanorları.add(48);

        // soru şu bu dizilerin hepsini nasıl bir değişkende saklayabilirim
        // bana iki boyutlu bir array list lazım.
        // array listin array listi yani

        ArrayList<  Integer  > tümnotlar=new ArrayList<>(); // bu haliyle bu ınetgerin listesi
        // bana array listin listesi lazım o yüzden ınteger yerine array list yazıyorum.

        ArrayList<   ArrayList<Integer>   > tümnotları=new ArrayList<>();
        tümnotları.add(matnorları);
        tümnotları.add(kimyanorları);
        tümnotları.add(fiziknorları);

        // bütün array listleri bir array liste attık.

        tümnotları.get(0); // bu bize mat notlarını verir. 1 yazarken kimya notlarını
        // 2 yazarsak da fizik notlarını verir

        // mat notlarının ilkini nasıl alırız.

        int ilkmatnonot=tümnotları.get(0).get(0); // mat notlarının ilk notunu verir

        System.out.println("ilkmatnonot = " + ilkmatnonot);
        System.out.println("tümnotları = " + tümnotları);
        System.out.println("kimyanorları = " + kimyanorları);
        System.out.println("fiziknorları = " + fiziknorları);
        System.out.println("matnorları = " + matnorları);

        /*************/

        // satır sütun şeklinde yazdırma

        for (int i = 0; i <tümnotları.size() ; i++) {

            for (int j = 0; j <tümnotları.get(i).size(); j++) {
                System.out.println("tümnotları.get(i).get(j) = " + tümnotları.get(i).get(j));

            }

            System.out.println();

        }
    }
}
