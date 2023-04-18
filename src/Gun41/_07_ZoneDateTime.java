package Gun41;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class _07_ZoneDateTime {
    //Başka zaman dilimleri ve bölgelerinin zaman bilgisini alma

    public static void main(String[] args) {

        // windowsun bulunduğu default zamanı verir
        ZonedDateTime zdt=ZonedDateTime.now();
        System.out.println("zdt = " + zdt);

        Set<String> zamanbölgeleri= ZoneId.getAvailableZoneIds();

        for (String z :zamanbölgeleri ) {
            if (z.toLowerCase().contains("ist"))
                System.out.println("z = " + z);

        }

        ZoneId zoneıdIst=ZoneId.of("Europe/Istanbul");
        ZonedDateTime zoneist=ZonedDateTime.now(zoneıdIst);
        System.out.println("zoneist = " + zoneist);

        ZoneId zoneIdLondon=ZoneId.of("Europe/London");
        ZonedDateTime londonsaat=ZonedDateTime.now();
        System.out.println("londonsaat = " + londonsaat);



    }


}
