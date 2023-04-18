package Odevler.Diziler;

public class OdevDizilerSoru2 {
    public static void main(String[] args) {
        // bir String oluşturun : "Hello World" Stringi tersten yazdırın ve print edin.


        String isim="kübra";
        for (int i = 0; i <isim.length(); i++) {
            System.out.println(isim.charAt(i));
        }

        String cumle="Kübra javayı çok iyi öğreniyor";
        for (int i = cumle.length()-1 ; i>=0; i--) {
            System.out.print(cumle.charAt(i)); // charAt belirtilen indexteki değeri veriyor.



        }




    }
}
