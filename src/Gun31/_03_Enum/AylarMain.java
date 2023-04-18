package Gun31._03_Enum;

public class AylarMain {
    public static void main(String[] args) {

        System.out.println("Aylar.OCAK = " + Aylar.OCAK);

        Aylar ay=Aylar.OCAK;

        System.out.println("ay = " + ay.ayNo);
        System.out.println("ay.ayAd = " + ay.ayAd);
        System.out.println("ay.GunMiktar = " + ay.GunMiktar);

        for (Aylar a: Aylar.values()){
            System.out.println("a.ayNo+ a.ayAd+ a.GunMiktar = "
                    + a.ayNo+ a.ayAd
                    + a.GunMiktar);

        }
        
        
    }
    
   
    
    
}
