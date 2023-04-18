package Gun23;

import java.util.HashSet;
import java.util.Iterator;

public class _03_Sets {  public static void main(String[] args) {
    HashSet<String> renkler = new HashSet<>();
    renkler.add("Red");
    renkler.add("Green");
    renkler.add("Blue");
    renkler.add("Red");
    renkler.add("RED");

    // EKRANA YAZDIRMA
    System.out.println("renkler = " + renkler);

    // ekrana tek tek yazdırma
    for (String eleman : renkler) {// sıra garanti değil
        System.out.println("eleman = " + eleman);
    }

    // foreach ile ilgili örnek olsun diye eklendi

    // int [] dizi={34,5,6,7,11,855};
    //  for (int sayi: dizi)
    //  {
    //     System.out.println("sayi = " + sayi);}


    Iterator gösterge=renkler.iterator(); // iteratör dizinin sırasına göre sırayla verir.
    while (gösterge.hasNext()) {// eğer devamı varsa if has the next. sonunu bilmiyoruz. ondan while.
        System.out.println("gösterge = " + gösterge.next());}

    // iteratör hafizada durduğu şekliyle verir. for each ise rastgele karpuz atar gibi verir.
}}
