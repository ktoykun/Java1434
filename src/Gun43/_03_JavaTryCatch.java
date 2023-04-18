package Gun43;

import java.time.LocalDate;
import java.time.Month;

public class _03_JavaTryCatch {
    public static void main(String[] args) {
        System.out.println("Program Çalışmaya Başladı");

        try { // hatanın başladığı yere konur
            LocalDate date=LocalDate.of(2023, Month.FEBRUARY, 30);

        }catch ( Exception ex){ // hata oluştuğunda yapılması istenenler
            // buraya yazılır.
            System.out.println("tekrar deneyiniz");
            System.out.println("Tüm hata mesajı = " + ex);
            System.out.println("Hatanın açıklaması = " + ex.getMessage());

    }

        System.out.println("Program bitti");

        try {
            //Java ve toolları çalışmaya devam et
            // konuları öürenmeye ve çalışmaya devam et
            //anlamadığın yer mi olduğu?kırılmadan devam et
        }catch (Exception ex) {
            //hatanın sebebini belirle
            // derse daha fazla odaklan
            // ilgili videoları izle
            // grup çalışması yap
            // öğren ve kırılmadan devam et
            // unutma sen bir söz verdin
        }
            // sonunda seni güzel bir meslek bekliyor

    }
}
