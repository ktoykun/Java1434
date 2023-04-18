package Gun21;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_ArrayListSoru {
    public static void main(String[] args) {
        // bir öğretmenden girmek istediği kadar notu alınız.
        // öğretmene devam etmek istiyor musunuz şeklinde sorunuz
        // ortalamayı geçen öğrenci sayısını bulunuz.

        Scanner oku = new Scanner(System.in);
        Scanner okuStr=new Scanner(System.in);

        ArrayList<Integer> notlar = new ArrayList<>();

        String cevap;
        int ort = 0;
        int toplam = 0;

       do {System.out.println("Notu giriniz: ");
           int ogrnot = oku.nextInt();
           notlar.add(ogrnot);
           toplam = ogrnot + toplam;

            System.out.println("Devam etmek istiyor musunuz? ");
            cevap = okuStr.nextLine();

        } while (cevap.equalsIgnoreCase("E"));

        ort = toplam / notlar.size();

        int gecen=0;
        for (int i = 0; i < notlar.size() ; i++) { // burada artık dizi boyutu belli.
            // o yüzden fori kullandık

            if (notlar.get(i) > ort)
                gecen++;

        }

        System.out.println("gecen = " + gecen);

    }
    }

