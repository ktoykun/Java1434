package Gun24;

import java.util.HashMap;
import java.util.Map;

public class _02_JavaMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hm= new HashMap<>();
        hm.put(1001, "Kübra TOYKUN");
        hm.put(1002, "Cihat Yılmaz");
        hm.put(2001, "Furkan TOYKUN");
        hm.put(5001, "Nurten TOYKUN");
        hm.put(1002, "Ayşe TOYKUN");

        System.out.println("hm = " + hm.keySet());
        System.out.println("hm = " + hm.values());

        for (Integer k : hm.keySet())
            System.out.println(k + "\t");

        System.out.println();

        for ( String v : hm.values())
            System.out.println(v + "\t");

        System.out.println();{

        for (Map.Entry<Integer, String> kv: hm.entrySet());
    }


    }
}
