package Gun22;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_Java2DArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> matnotları = new ArrayList<>();
        ArrayList<Integer> fiziknotları = new ArrayList<>();
        ArrayList<Integer> kimyanotları = new ArrayList<>();

        matnotları.add(40);
        matnotları.add(50);
        matnotları.add(60);

        fiziknotları.add(30);
        fiziknotları.add(40);

        kimyanotları.add(70);
        kimyanotları.add(80);
        kimyanotları.add(90);
        kimyanotları.add(100);

        ArrayList<ArrayList<Integer>> tümnotlar = new ArrayList<>();
        tümnotlar.add(matnotları);
        tümnotlar.add(kimyanotları);
        tümnotlar.add(fiziknotları);

        // ders adlarını bir array listten alarak her dersin adını
        // ve notlarını bir satıra yazdırınız.
        // MAtematik: 40,50,60
        //Fizik: 30,40
        //Kimya: 70,80,90,100

        ArrayList<String> dersler = new ArrayList<>();
        dersler.add("Matematik");
        dersler.add("Fizik");
        dersler.add("Kimya");

        for (int i = 0; i < tümnotlar.size(); i++) { // her bir derslerin tüm notları

            System.out.print(dersler.get(i) + " : ");

            for (int j = 0; j < tümnotlar.get(i).size(); j++) { // tek tek notlar
                System.out.print(tümnotlar.get(i).get(j) + "\t");

            }
            System.out.println();
        }

        // Soru:2
        // kullanıcıdan istediği bir dersin no sunu alarak (0-Mat, 1-Fiz, 2-Kim)
        // sadece istediği derse ait notları bir metodda yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("Ders no giriniz: ");
        int dersno = oku.nextInt();

        dersNotlarıYazdır(tümnotlar, dersno); // bunu yazdırması içi önce ders notlarına
        // sonra da o dersin no suna ihtiyaç var.


        // Soru:3
        // yukarıda verilen derse ait not ortalamasını
        // ve geçen sayısını bir metodda yazdırınız.

        dersOrtveGecenMik(tümnotlar, dersno);

    }

    public static void dersNotlarıYazdır(ArrayList<ArrayList<Integer>> tümnotlar, int dersno) {
        for (int i = 0; i < tümnotlar.get(dersno).size(); i++) {  // tüm derslerden ders nosu verilenin size'na kadar
            System.out.println(tümnotlar.get(dersno).get(i) + "\t");

        }
    }

    public static int dersOrtveGecenMik(ArrayList<ArrayList<Integer>> tümnotlar, int dersno) {
        int toplam = 0;
        for (int i = 0; i < tümnotlar.get(dersno).size(); i++) {
            toplam += tümnotlar.get(dersno).get(i);
        }

        int ort = toplam / tümnotlar.get(dersno).size();

        int gecenMik = 0;

        for (int i = 0; i < tümnotlar.get(dersno).size(); i++) {
            if (tümnotlar.get(dersno).get(i) >= ort)
                gecenMik++;

        }
        System.out.println("ort = " + ort);
        System.out.println("gecenMik = " + gecenMik);


        return toplam;

    }
}










