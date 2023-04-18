package Odevler._04_12_2DArrays;

import java.util.Arrays;

public class _Odev_2D_Soru5 {
    public static void main(String[] args) {

       /*
        ismi getCount() olan bir method oluşturun.
        Parametre olarak bir String ArayList  ve  bir tane String
        Return tipi int olmalı.
        ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.

        */

    String [] arr={"Banana", "Orange", "Kiwi", "Peach", "Banana"};
        System.out.println(getCount(arr));
                }

public static String getCount (String [] arr)
        {
        int sayac=1;
        String tekrar="";
        Arrays.sort(arr);
        for (int i = 1; i < arr.length ; i++) {
        if (arr[i-1].equals(arr[i])){
        sayac++;
        tekrar=arr[i];

        }}

        return tekrar+ " "+sayac+ "kez yazılmış";


        }}