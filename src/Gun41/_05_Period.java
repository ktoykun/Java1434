package Gun41;

import java.time.LocalDate;
import java.time.Period;

public class _05_Period {
    public static void main(String[] args) {
        // period iki tarih arasındaki farkı gösterir
        // sadece local date için kullanıyoruz.

        LocalDate birthdate=LocalDate.of(1994, 12, 21);
        LocalDate bugün=LocalDate.now();

       Period fark= Period.between(birthdate, bugün);
        System.out.println("fark = " + fark);

        System.out.println("fark.getYears() = " + fark.getYears());
        System.out.println("fark.getDays() = " + fark.getDays());

        System.out.println(fark.getYears() + " Yaşındasınız " );
        /**************/

        Period period3Gun=Period.ofDays(3);
        Period period3yıl=Period.ofYears(6);
        Period period6ay=Period.ofMonths(6);

        System.out.println("period3ay = " + period3yıl);
        System.out.println("period3Gun = " + period3Gun);

        LocalDate ucgunsonra=bugün.plus(period3Gun);
        LocalDate ucyılsonra=bugün.plus(period3yıl);


        LocalDate kursbası=LocalDate.of(2022, 10, 31);
        LocalDate kursonu=kursbası.plus(period6ay);
        System.out.println("kursonu = " + kursonu);
        System.out.println("kursonu.getDayOfWeek() = " + kursonu.getDayOfWeek());

        // kursun bitişine ne kadar kaldı
        Period nekadarkaldı=Period.between(bugün, kursonu);
        System.out.println("nekadarkaldı = " + nekadarkaldı);

        //kurs ne kadar süredir devam ediyor
        Period suanakadargecengun=Period.between(kursbası, bugün);
        System.out.println("suanakadargecengun = " + suanakadargecengun);









    }
}
