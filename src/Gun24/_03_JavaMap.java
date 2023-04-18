package Gun24;

import java.util.HashMap;
import java.util.Map;

public class _03_JavaMap {
    public static void main(String[] args) {
        // bir kartvizit uygulamasını 2 kişi için yapınız
        HashMap <String, String> ukartvizit=new HashMap<>(); // burada sol taraf key, sağ taraf value.
        ukartvizit.put("isim", "Uğur Yılmaz");
        ukartvizit.put("e mail", "ugur@gmail.com");
        ukartvizit.put("adres", "şişli/ist");
        ukartvizit.put("telefon", "123456");

        System.out.println("ukartvizit = " + ukartvizit.get("isim"));
        System.out.println("ukartvizit = " + ukartvizit.get("e mail"));
        
        HashMap<String, String> akartvizit=new HashMap<>();
        akartvizit.put("isim", "ayşe bayrak");
        akartvizit.put("e mail", "ayse@hgmail.com");
        akartvizit.put("adres", "çekmeköy");
        akartvizit.put("telefon", "456123");
        
        HashMap<String,  HashMap<String, String>    > kartvizitler=new HashMap<>();
        
        kartvizitler.put("ugur", ukartvizit);
        kartvizitler.put("ayse", akartvizit);

        System.out.println("kartvizitler.get(\"ugur\") = " + kartvizitler.get("ugur"));
        System.out.println("kartvizitler.get(\"ayse\") = " + kartvizitler.get("ayse"));

        System.out.println("kartvizitler = " + kartvizitler.get("ayse").get("adres"));
        // burada ayşenin adresini aldık, önceyi ayşeyi çağırdık. sonra adresini aldık.

        // sadece emailleri nasıl alırdık.

        for (Map.Entry<   String, HashMap<String, String>> kzt: kartvizitler.entrySet() ){
            System.out.println("kzt = " + kzt.getValue().get("e mail"));
            // burada get value dediğinde her şeyi yazdırır o yüzden yanına get e mail dedik.
    }
}}
