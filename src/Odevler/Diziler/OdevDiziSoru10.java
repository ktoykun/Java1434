package Odevler.Diziler;

public class OdevDiziSoru10 {
    public static void main(String[] args) {
        // int Array oluşturun ve elemanları : 14 , 19 , 5 , 21


        int [] dizi={14,19,5,21};
        int min =dizi[0]; // dizinin ilk elemanını en küçük olarak atadık.

        for (int i = 0; i < dizi.length ; i++) {
            if (dizi[i]<min)
                min=dizi[i];

        }

        System.out.println("en küçük:  " + min);

        int max=dizi[0];

        for (int i = 0; i < dizi.length ; i++) {
            if (dizi[i]>max)
                max=dizi[i];

        }

        System.out.println("en büyük = " + max);

    }
}
