package Gun20;

public class _06_JavaMethod {
    public static void main(String[] args) {
        int s1 = 4;
        int s2 = 12;
        int s3 = 34;
        int s4 = 45;

        int sonuc1 = toplamBul( "kübra", s1, s2);
        int sonuc2 = toplamBul("osman", s1, s2, s3);

        System.out.println("sonuc1 = " + sonuc1);
        System.out.println("sonuc2 = " + sonuc2);

        // burada parametreler aynı tip. sadece miktarları farklı.
        //bu tip durumlar için bir kolaylık var.

        //1- Bir metodda parametre olarak sadece 1 tane alabilir
        //2. Her zaman, son parametre dizi olan olmalı. Kalan sağlar onun oluyor.
        // sırayla eşleşiyor. 1., 1.ye. kübra >> isim
        // gelen sayı kaç olursa olsun hepsini dizi şeklinde metoda al.
    }

        public static int toplamBul(String isim, int... sayilar) // bu bir dizidir diyor.
                // kaç tane kullanacağın belli değilse böyle de yapabilirsin.
        {
            int toplam = 0;
            System.out.println("isim = " + isim);
            for (int i = 0; i < sayilar.length; i++) { // kaç sayı gelirse gelsin onları
                // dizi şekline alıyor.

                toplam=toplam+sayilar[i];

            }
            return toplam;

        }

    }

