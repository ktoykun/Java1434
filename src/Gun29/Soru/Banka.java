package Gun29.Soru;

public class Banka {
    // Hesap (yatan(int), cekilen(int), bakiye(int))
    // Musteri (hesapID(int), ad, soyad, MusteriHesap(Hesap tipinde))
    // Bir banka uygulaması için 1 müşteri tanımlayınız,
    // müşterini hesabına sırasıyla 100 tl, 200tl yatırınız,sonra 50 TL çekiniz.
    // Müşteirinin toplan yatanı, toplam cekılenı ve kalan bakiyesini yazdırınız.
    // bakiyeye direk para atanamadıgını kontrol ediniz.
    public static void main(String[] args) {

    musteri mus1=new musteri();
    mus1.adı="Kübra";
    mus1.soyadı="Toykun";
    mus1.musterihesap.paraYatir(100);
    mus1.musterihesap.paracek(50);

        System.out.println(mus1.musterihesap);

    }



}
