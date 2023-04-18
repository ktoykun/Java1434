package Gun21;

import java.util.ArrayList;

public class _01_ArrayList {
    public static void main(String[] args) {
        // dizi: boyut sayısı belli.
        int [] dizi =new int[5]; // array 5 elemanlı boyutu sonradan değiştirilmiyor bunun..

        // bu array listin özelliği ise boyutunun değişebilir olması. sadeec daha yavaştır.
        // boyutu dinamiktir. eleman geldikçe eklenir. çıkardıkça azalır.
        // boyutu başta vermene gerek yok. boyut başlangıçta 0.
        // aşağıdaki gibi tanımlanıyor.
        ArrayList<Integer> yeniliste=new ArrayList<>(); // içine tipini yazıyoruz. integer gibi.
        ArrayList<String> isimliste=new ArrayList<>();
        ArrayList<Double> doublelist=new ArrayList<>(); // içi hep büyük harfle başlıyor.

        // diizleri yazdırırken arraylist to string yapıyorduk. burada dah akolay direkt yazıdıryoruz.
        // yazdırma olayı da şöyle. irekt kendisini yazdırabilirsin.
        System.out.println("yeniliste = " + yeniliste);
        System.out.println("isimliste = " + isimliste);

        // şu an içi boş. doldurma olayı şöyle:
        isimliste.add("kübra" +
                " metin" +
                " cemre" +
                " ayla"); // uzunluk hala 1

        isimliste.add("osman"); // uzunluk 2. araya virgül koyar.
        isimliste.add("halil");

        System.out.println("isimliste.size() = " + isimliste.size()); // uzunluk verir.
        System.out.println("isimliste = " + isimliste);

        // verilen bir indexe eleman ekleme olayı var şöyle:
        isimliste.add(2, "furkan"); // 2. indexe furkan yaz demek. araya sıkıştırır.
        System.out.println("isimliste = " + isimliste);

        // indexin olduğu yeri değiştirme. bir elemanı bi yerden alıp başka bir yere koyma.
        isimliste.set(1, "halil"); // bu indexteki elemanı halil ile değiştirdik.
        System.out.println("isimliste = " + isimliste);

        // bir eleman var mı yok mu bulma işlemi şöyle;
        boolean varMmı= isimliste.contains("halil");
        System.out.println("varMmı = " + varMmı);

        // eleman silme olayı şöyle
        isimliste.remove("halil");
        System.out.println("isimliste = " + isimliste);

        // belli bir indexteki elemanı silme. her zaman indexe göre siler.integer de olsa. indexi siler.
        // integer bir elemanı silmek için başına (Object) yazarız.
        isimliste.remove(1);
        System.out.println("isimliste = " + isimliste);

        int indexOf=isimliste.indexOf("halil");
        System.out.println("indexOf = " + indexOf);

        // bir indexteki elemanı alma olayı.
        String ilkeleman=isimliste.get(0);
        System.out.println("ilkeleman = " + ilkeleman);

        isimliste.clear(); // her şeyi siler.
        System.out.println("isimliste = " + isimliste);

    }
}
