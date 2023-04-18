package Gun29._02_PrivateErisimleri;

public class Sirket {
    public static void main (String []args) {
        Calisan cal1=new Calisan();

        cal1.id=5;
        cal1.name="kübra";
        cal1.surname="toykun";
        // cal1.passwork="1234";
        // artık private kendi paketinden bile
        // çağırılamaz.
        cal1.sifreAta("1234");
        cal1.sifreAta("K123_kbr56");
        cal1.SifreGoster();





    }
}
