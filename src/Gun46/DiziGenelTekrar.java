package Gun46;

public class DiziGenelTekrar {
    public static void main(String[] args) {
        // tek boyutlu diziler
        int [] dizi=new int[]{1,2,3,4,5,6};
        int [] dizi1=new int[]{1,2,3,4,5};

        int dizi5 []= {1,2,3,4,5};

        int [] dizi2=new int[3];
        dizi2 [0]=5;
        dizi2 [1]=5;
        dizi2 [2]=5;

        System.out.println("dizi1.length = " + dizi1.length);
        // bu dizinin eleman sayısını verir

        for (int i = 0; i <dizi1.length ; i++) { //dizinin uzunluğuna kadar
            // bütün elemanlar yazdırır.
            System.out.print(dizi1[i] + " ");

        }
        System.out.println();
        // index sırasıyla gittiği için SIRA GARANTİ

        for (int eleman :dizi1  ) {
            System.out.print( eleman + " ");

        };
        System.out.println();

        // iki boyutlular
        int [] [] tablo1=new  int[2][3];
        tablo1[0][0]=4; tablo1[0][1]=14; tablo1[0][2]=22;
        tablo1[1][0]=24; tablo1[1][1]=33; tablo1[1][2]=12;
        // elemanlar verildiğinde zaten sayı elemanlardan geldiği için
        // boyut sayıları verilmiyor

        // elemanlar verildiğinde zaten sayı elemanlardan geldiği için boyut sayıları verilmiyor
        int[][] tablo2 =new int[][]{

                {1,3, 4},
                {56,7,8}
        };

        // new int[][] vermeden de ilk tanımlama anında elemanları verebiliriz.
        int[][] tablo6 ={
                {1,3, 4},
                {56,7,8}
        };

        int[][] tablo3 = new int[2][3];
        tablo3[0] = new int[]{2,3,4,5,6}; // her bir satırın yeniden tanılayabiliriz
        tablo3[1] = new int[]{2,3};

        int tablo4[][]=new int[2][3]; // köşeli parantezler değişkenin
        // adını da alabilir.

        // tablo 4: satır sayısı 2, her satırın kendi uzunluğu var,
        // 1. satırın uzunluğu: 3 -- 2. satırın uzunluğu: 3
        //tablo 3: satır sayısı 2,
        // 0. satırın uzunluğu 5, 1. satırın uzunluğu 2

        System.out.println("tablo3.length = " + tablo3.length);
        //tablo 3'ün satır sayısını verirecek.tablonun elemanları satıralrda oluşur
        System.out.println("tablo3 = " + tablo3[0].length);
        //0. satırın lenghti 5
        System.out.println("tablo3 = " + tablo3[1].length);
        // 1. satırın lenght 2

        for (int i = 0; i < tablo3.length; i++) {
            for (int j = 0; j <tablo3[i][j] ; j++) {
                System.out.print(tablo3[i][j]); // 0. satır için 00, 01, 02, 03,04
                                                // 1 . satır için 10,11

            }
            System.out.println();


            System.out.println("****************");

            for (int [] satir : tablo3   )
            {
                for (int eleman :satir  ) { // satirin elemanları yani int yani sayı
                    System.out.print(eleman+ " ");

                }

                System.out.println();

            }

            System.out.println("*************");

            for (int [] satir :tablo3     )
            {

                // 1. adımda satır 2,3,4,5,6 aşağıdaki döngü 2,3 , yazar
                // 2. adımda satır 2,3 aşağıdaki döngü satırın tamamını yazar

                for (int j = 0; j <tablo3.length ; j++) { // tablo 3, lenght 2
                    System.out.print(satir[i]);
                }
                System.out.println();
            }

        }
    }
}
