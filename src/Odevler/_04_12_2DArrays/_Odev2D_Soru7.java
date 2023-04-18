package Odevler._04_12_2DArrays;

import java.util.ArrayList;
import java.util.Collections;

public class _Odev2D_Soru7 {
    public static void main(String[] args) {
        // getLength() isminde bir method oluşturun.
        //Parametre olarak String ArrayList
        //Return tipi Integer ArrayList
        //ArrayList içindeki her bir Stringin uzunluğunu bulunuz.
        //Tüm elementlerin uzunluğunu döndürün
        //Örneğin;
        //ArrayList  :  "New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"
        //Tüm Stringlerin uzunluklarını yazdırın;
        //cevap: 10 ,  8 , 4 , 7 , 6 olmalı

        ArrayList<String> liste=new ArrayList<>();
        Collections.addAll(liste,"New jersey" ,"New york" , "Ohio" , "Florida" , "Boston" );
        System.out.println(getLength(liste));

        for (Integer b : getLength(liste)){
            System.out.println(b +" ");
    } }

    public static  ArrayList<Integer>  getLength ( ArrayList<String>  liste){ // integer olan return tipini,
        // listenin yanındaki listenin tipini gösterir.
        ArrayList<Integer> uzunluk=new ArrayList<>();
        for (String a : liste){
            uzunluk.add(a.length());
        }

        return  uzunluk;

    }
}
