package Gun46;

public class S21 {
    public static void main(String[] args) {
        int [] [] arr=new int[2][4];
        arr[0]=new int[]{1,3,5,7};
        arr[1]=new int[]{1,3};

        System.out.println("arr.length = " + arr.length);
        System.out.println("arr[0].length = " + arr[0].length); // 0. satırın eleman sayısı
        System.out.println("arr[0].length = " + arr[1].length); // 1. satırın eleman sayısı

        for (int [] a :arr ) { // her bir eleman satırlardan oluşuyor
            for (int i = 0; i < arr.length ; i++) { // dikkat et arr lenghti 2.dolayısıyla
                // bu 2'ye kadar yazıyor. burada "a.length" deseydi
                // o zaman her bir satırı, yani satırın bütün elemanlarını
                // yazardı. yani satırın uzunluğu kadar olurdu.
                System.out.print(a[i] + " ");
            }

            System.out.println();

        }
    }
}
