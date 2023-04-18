package Odevler.Diziler;

public class OdevDiziSoru11 {
    public static void main(String[] args) {
        // int Array oluşturun ve elemanları : 12,2,5,15,8

        int [] arr={12,2,5,15,8};
        int max=arr[0];

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>max)
                max=arr[i];

        }

        System.out.println("en büyük sayı = " + max);
    }
}
