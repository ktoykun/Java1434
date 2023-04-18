package Gun31._04_EnumSoru;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PizzaOrderHat {
    // Bir pizza sipariş hattı yapılmak isteniyor.
    // Kullanıcıya Pizza için 1-Small,2-Medium,3-Large, 4-Goster
    // seçeneklerini bir menü şeklinde vererek, verdiği pizzaları
    // bir ARRAYLIST e atınız.
    // Goster (4) ü seçtiğinde her pizzadan kaçar tane sipariş
    // verdiğini bir metodda yazdırınız.
    public static void main(String[] args) {

        // NOT: main static olduğu için sttaicde kullanılan her şey diğer metodlar da static olmalı.

        Scanner oku = new Scanner(System.in);
        ArrayList<Pizza> siparisler = new ArrayList<>();
        int secim = 0;

        do {
            menu();
            secim = oku.nextInt();
            // scanner ile seçimi alalım

            // secilen pizzayı arayyliste ekleyelim

            switch (secim) {
                case 1: // small
                    Pizza sp = new Pizza(PizzaSize.SMALL);
                    siparisler.add(sp);
                    break;
                case 2: // medium
                    Pizza mp = new Pizza(PizzaSize.MEDIUM);
                    siparisler.add(mp);
                    break;
                case 3:// large
                    Pizza lp = new Pizza(PizzaSize.LARGE);
                    siparisler.add(lp);
                    break;
                case 4:
                    SiparisYazdır(siparisler);
                    break;
            }

        }while (secim <= 4);
    }
     public static void menu()

    {
            System.out.println("*******MENU*********");
            System.out.println("1- Small Pizza");
            System.out.println("2- Medium Pizza");
            System.out.println("3- Large Pizza");
            System.out.println("4- Siparis Göster ");
            System.out.println("5- Çıkış ");
            System.out.println("Seciminiz");

        }

    public static void SiparisYazdır(ArrayList<Pizza> siparisler){
            int s=0, m=0, l=0;
            for (Pizza p: siparisler )

            {
                if (p.size==PizzaSize.SMALL) s++;
                else
                if (p.size==PizzaSize.MEDIUM) m++;
                else
                if (p.size==PizzaSize.LARGE) l++;

            }

        System.out.println("*********Siparişleriniz*********");
        System.out.println("Small Pizza Count=" + s);
        System.out.println("Medium Pizza Count =" + m);
        System.out.println("Large Pizza Count =" + l);
    }
    }


