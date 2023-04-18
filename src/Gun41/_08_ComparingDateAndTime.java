package Gun41;

import java.time.LocalDate;
import java.time.LocalTime;

public class _08_ComparingDateAndTime {
    public static void main(String[] args) {

        LocalDate bugün=LocalDate.now();
        LocalDate dün=bugün.minusDays(1);

       Boolean sonraMı=bugün.isAfter(dün); //bugün dünden sonra mı?
       System.out.println("sonraMı = " + sonraMı);

        Boolean öncemi=bugün.isBefore(dün);
        System.out.println("öncemi = " + öncemi);

        boolean esitmi=bugün.isEqual(dün);
        System.out.println("esitmi = " + esitmi);

        boolean artıkyılmı=bugün.isLeapYear();
        System.out.println("artıkyılmı = " + artıkyılmı);




    }
}
