package Odevler.Diziler;

public class OdevDiziSoru8 {
    public static void main(String[] args) {
        // int Array oluşturun ve elemanları : 5,6,8,12,14,19
        // Eğer sayı çiftse topla, tekse çıkar.

        int sumup=0;
        int [] dizi={5,6,8,12,14,19};

        for (int i = 0; i < dizi.length ; i++) {
            if (dizi[i]%2 ==0) { sumup=sumup+dizi[i];}

            else {
                sumup=sumup-dizi[i];
                 }}

        System.out.println("toplam = " + sumup);




    }}

