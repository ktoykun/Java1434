package Odevler._04_12_2DArrays;

import java.util.ArrayList;
import java.util.Collections;

public class _Odev2D_Soru6 {
    public static void main(String[] args) {
        //getSum() isminde bir method oluşturun.
        //Parametresi ArrayList olmalı
        //Return tipi int olmalı.
        //ArrayList teki tüm sayıları birbiri ile toplayın.
        //return olarak toplam sonucu döndürün.
        //Örneğin;
        //Arraylist = 1,2,3,4,5
        //return 15 olmalı

        ArrayList<Integer> list=new ArrayList<>();
        Collections.addAll(list, 1, 2, 3,4,5); // listeye 1 2 3 4 5 elemanlarını ekle
        System.out.println(getSum(list));
    }

    public static int getSum (ArrayList<Integer> liste) {
         int toplam=0;
         for (Integer integer : liste)
         toplam+=integer;
                return toplam;
        }

}
