package Gun31._01_Renum;

public class Ornek1 {
    public static void main(String[] args) {
        // verilen bir ay noya göre ayın gün sayısını veren
        //programı yazınız
        int ayNo = 5;

        switch (ayNo) {
            case 2:
                System.out.println(28);
                break;
            case 1: // Ocak
            case 3: // mart
            case 22:
            case 10:
            case 12:
                System.out.println(31);
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(30);
                break;

        }
        // okunabilirlik ve kontrollü yazılım yok, tanımlama yetersiz
        // numaradan gitmeye çalıştık, zorluklarla karşılaştık
        // bunun yerine isimden gitmeye çalışalım
        String ayAd = "Mayıs";
        switch (ayAd) {
            case "şubat": System.out.println(28); break;
            case "ocak":
            case "mart":
            case "ağustos":
            case "haziran":
            case "aralık": System.out.println(31);break;
            case "temmuz":
            case "eylül":
            case "ekim":
            case "kasım":

        }



    }
}
