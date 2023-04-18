package Gun32._01_Encapsulation;

public class KisiMain {
    public static void main(String[] args) {
        Kisi kisi1 = new Kisi();
        kisi1.setAd("Kübra");
        kisi1.setSoyad("Toykun");
        kisi1.YasAta(23);// kişi saçma sapan -li bi şey
        // yazabilir. hatalı girdiğini anlaması için
        // yası tanımlayan bir metod olmadı.

        // değişkene direkt erişimi kapatıp
        // birmetod ile korumalı olarak veri
        // gönderme ve alma işlemine encapsulation denir.
        // değişkeni private yağtığımız için ona ulaşamıyorduk
        // burada yas ver set ad vs diyerek yaşa ulaşabilmeyi sağladık.
        // ama sadece belirli bir kurala göre.
        // her değişkenin bir set i bir de get i olur.

        System.out.println(kisi1.yasVer());
        System.out.println(kisi1.getAd());
        System.out.println(kisi1.getSoyad());

        System.out.println("kisi1 = " + kisi1);

    }
}
