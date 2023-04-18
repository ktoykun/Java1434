package Gun39._05_OOP_Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class TechnoCafe {
    public static void main(String[] args) {

        ArrayList<Food> siparisler = new ArrayList<>(); // array list Food cinsinde olursa hepsini ekleyebiliriz.
        Scanner oku = new Scanner(System.in);
        int secim = 0;
        do {
            menu();
            System.out.print("Seçiminiz: ");
            secim = oku.nextInt();

            switch (secim) {

                case 1:
                    Food ak = new AdanaKebap();
                    siparisler.add(ak);
                    break;

                case 2:
                    Food lah = new Lahmacun();
                    siparisler.add(lah);
                    break;

                case 3:
                    Food pal = new Palov();
                    siparisler.add(pal);
                    break;

                case 4:
                    Food borsh = new Borsh();
                    siparisler.add(borsh);
                    break;


            }} while (secim < 5) ;





    }


    public static void menu(){

        System.out.println("Menü*\n" +
                "1-Adana Kebap (55 TL)\n" +
                "2-Lahmacun (33 TL)\n" +
                "3-Borsh (33 TL)\n" +
                "4-Palov (44 TL)\n" +
                "0-Tamam ");
    }

}