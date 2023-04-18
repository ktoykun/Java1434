package Odevler.Diziler;

public class OdevDiziSoru9 {
    public static void main(String[] args) {
        // int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30
        // Arraydaki en büyük 2. elemanı yazdıran bir program yazın.

        int max1=0;
        int max2=0;
        
        int arr []= {15,25,22,18,30};
        
        
        for (int i = 0; i < arr.length; i++) {
        
            if (arr[i]>max1){
                max2=max1;
                max1=arr[i];
            } else if (arr[i]>max2) {
            max2=arr[i];

            }
        }


        System.out.println(max2);
    }
}
