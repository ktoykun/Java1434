package Gun41;

import java.time.Duration;
import java.time.LocalTime;

public class _06_Duration {
    public static void main(String[] args) {
        // Duration hem localtime hem deocaldate time arasındaki farkı verir

        //LocalTime

        LocalTime dersbaslangıcı=LocalTime.of(19,0,0);
        LocalTime dersbitisi=LocalTime.of(22,0,0);

        Duration gunlukderssuresi=Duration.between(dersbaslangıcı, dersbitisi);
        System.out.println("gunlukderssuresi = " + gunlukderssuresi);

        // devamı var
    }
}
