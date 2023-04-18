package Gun20;

public class _05_JavaMethod {
    public static void main(String[] args) {
        int s1 = 4;
        int s2 = 12;
        int s3 = 34;
        int s4 = 45;

        int sonuc1 = toplamBul(s1, s2);
        int sonuc2 = toplamBul(s1, s2, s3);

        String ad = "Kübra";
        String soyad = "Toykun";
        String sonuc = toplamBul(ad, soyad);

    }

    // farklı metodlara aynı ismi kullanabiliriz yeter ki parametrelerinden
    // farklı oldukları ayırt edilebilsin. aşağıda hep toplambul yazdık mesela.

    public static int toplamBul(int s1, int s2) {
        return s1 + s2;
    }

    public static int toplamBul(int s1, int s2, int s3) {
        return s1 + s2 + s3;

    }

    public static String toplamBul(String ad, String soyad) {
        String sonuc = ad + " " + soyad;
        return ad+soyad;
    }


}
