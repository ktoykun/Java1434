package Gun24;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;

public class _04_JavaMap {
    public static void main(String[] args) {

        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(9, "tilki");
        hm.put(2, "kedi");
        hm.put(30, "köpek");
        hm.put(11, "kuş");
        hm.put(4, "kurt");
        System.out.println("hm = " + hm); // hızlı çalışmak için kendine göre sıralar.

        LinkedHashMap<Integer, String> lm = new LinkedHashMap<>();
        lm.put(9, "tilki");
        lm.put(2, "kedi");
        lm.put(30, "köpek");
        lm.put(11, "kuş");
        lm.put(4, "kurt");
        System.out.println("lm = " + lm); // eklendiği sıraya göre verir

        TreeMap<Integer, String > tm=new TreeMap<>();
        tm.put(9, "tilki");
        tm.put(2, "kedi");
        tm.put(30, "köpek");
        tm.put(11, "kuş");
        tm.put(4, "kurt");
        System.out.println("tm = " + tm); //Kendinden sortlu



    }
}
