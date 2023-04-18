package Gun41;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class _04_JavaLocalDateTime {
    public static void main(String[] args) {
        // hem tarih hem saat bilgisini tutar.
        LocalDateTime dt=LocalDateTime.now();
        System.out.println("dt = " + dt);
        System.out.println("dt.getMonth() = " + dt.getMonth());
        System.out.println("dt.getMonthValue() = " + dt.getMonthValue()); // ayın sayısını veriyor
        System.out.println("dt.getDayOfYear() = " + dt.getDayOfYear());
        System.out.println("dt.getDayOfMonth() = " + dt.getDayOfMonth());
        System.out.println("dt.getDayOfWeek() = " + dt.getDayOfWeek());
        System.out.println("dt.getDayOfWeek().getValue() = " + dt.getDayOfWeek().getValue());
        System.out.println("dt.getHour() = " + dt.getHour());
        System.out.println("dt.getMinute() = " + dt.getMinute());
        System.out.println("dt.getSecond() = " + dt.getSecond());
        System.out.println("dt.getNano() = " + dt.getNano());

        System.out.println("dt.format(DateTimeFormatter.ISO_DATE_TIME) = " + dt.format(DateTimeFormatter.ISO_DATE_TIME));
        System.out.println("dt.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)) = " + dt.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)));

        // özel formatta istediğiniz gibi yazdırma
        DateTimeFormatter f=DateTimeFormatter.ofPattern("dd.MM.yyy hh:mm");
        System.out.println("dt = " + dt.format(f));

    }
}
