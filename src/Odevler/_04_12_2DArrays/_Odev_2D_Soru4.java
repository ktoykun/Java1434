package Odevler._04_12_2DArrays;

import java.util.ArrayList;

public class _Odev_2D_Soru4 {
    public static void main(String[] args) {
        /*
              Bir tane 2d array [][]   oluşturun ve elemanları =  [  [ 1, 2, 3 ],  [ 4, 5, 6 ],  [ 7, 8, 9 ] ]
            Store all the elements in one arraylist and print the arraylist
            Tüm elemanları bir arrayListe yükleyin ve bu arrayList'i yazdırın.
*Girdi:**
[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]
**Çıktı:** [1,2,3,4,5,6,7,8,9]
```
         */

        ArrayList yeni= new ArrayList<Integer>();

        int dizi[][]={{1,2,3} , {4, 5, 6 },  {7,8,9} };
        for (int i = 0; i <dizi.length ; i++) {
            for (int j = 0; j <dizi[i].length ; j++) {

                yeni.add(dizi[i][j]); // yeni isimli dizinin içine i ve j nin
                // elemanlarını ekledik.

            }

        }

        System.out.println("yeni = " + yeni);
    }
}
