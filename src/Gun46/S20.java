package Gun46;

public class S20 {

    public static void main(String[] args) {
        int []dizi=new int []{2,5,6,7};// böyle de olabilir
        int []dizi1 ={2,5,6,7}; // böyle de olabilir
        dizi=new int[]{2,5,8,4,6};

        /************/

        int [] [] arr=new int[2][4]; // 0. satır 2 elemanlı. aşağıda yeniden tanımladığımız için. burada tanımlanmış
        // aslında burada 4 yazan yerin bir anlamı, önemi yok.
        arr [0]=new int[] {1, 3, 5, 7}; // (1. satır ) burada 0. satur yeniden tanımlandı artık 4 elemanlı.
        // burada yeniden atadık. yeniden atama işlemi için muhakkah new int gerekli
        arr [1]=new int[] {1, 3}; // 2. satır artık 2 elemanlı

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }

        /************/

        for (int [] satir :arr ) { // arr dizisi satırlardan oluşuyor. yani bu dizinin
            // satırlarını eleman olarak sol tarafa alıyoruz. elemanları satır satır gönderiyor.
           // tek tek alma şansı yok. satırları baz alır.
            for ( int eleman :satir ) { // sonra bu satırların içindeki elemanları alıyoruz.
                System.out.print( eleman + " ");
            }
            System.out.println();

        }
    }
}
