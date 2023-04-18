package Odevler._04_12_2DArrays;

import java.util.Arrays;

public class _Odev2D_Soru3 {
    public static void main(String[] args) {
        /*
        Aşağıdaki gibi olan bir 2D String Array oluşturunuz.
        [{"new jersey","atlanta","ohio"} ,
        {"Pittsburgh" ,"ohio","new york","ohio"} ,
        {"ohio","new york"}]

         Bütün ohio'ları Florida'yla değiştiriniz.Array'i yazdırınız.
         */

        String dizi [][] ={
                {"new jersey", "atlanta","ohio"} ,
                {"Pittsburgh" ,"ohio","new york","ohio"},
                {"ohio","new york"} };

        System.out.println(Arrays.deepToString(dizi));


        for (int i = 0; i < dizi.length ; i++) {
            for (int j = 0; j <dizi[i].length ; j++) {
                if (dizi[i][j].equals("ohio"))
                    dizi[i][j]="Florida";

            }

        }

        System.out.println(Arrays.deepToString(dizi));
    }
}
