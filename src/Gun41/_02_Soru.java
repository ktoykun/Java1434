package Gun41;

import Gun40.MyFunc;

import javax.swing.text.DateFormatter;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _02_Soru {
    // canlı dijital saat yapınız

    public static void main(String[] args) {
        while (true) {

            DateTimeFormatter f = DateTimeFormatter.ofPattern("kk:mm:ss");
            LocalTime saat = LocalTime.now();
            System.out.print("\r" + saat.format(f));
            MyFunc.bekle(1); //Gun 40'ın içinde

        }
    }
}
