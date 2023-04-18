package Odevler._04_12_2DArrays;

import java.util.ArrayList;
import java.util.Collections;

public class _Odev2D_Soru8 {
    public static void main(String[] args) {
        //İsmi changelnArraylist() olan bir method oluşturun.
        //Parametre olarak String ArrayList, String s1, String s2
        //Arraylist'te s1'i s2 olarak değiştirin
        //Return String arrayList

        ArrayList<String> renk=new ArrayList<>();
        Collections.addAll(renk, "yellow" , "red" , "blue" , "red" , "blue" );
        System.out.println(changelnArrayList(renk));

            }

    public static ArrayList<String> changelnArrayList (ArrayList<String> renk ){
        ArrayList <String> change=new ArrayList<>();
        for (String a: renk ) {
            if (a.equals("blue"))
                a="yellow";
                change.add(a);
        }

        return change;
    }
}
