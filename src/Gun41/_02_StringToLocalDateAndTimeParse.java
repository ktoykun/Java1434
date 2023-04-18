package Gun41;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class _02_StringToLocalDateAndTimeParse {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.println("Tarih Giriniz: ");
        String strTarih=oku.nextLine();

        DateTimeFormatter f=DateTimeFormatter.ofPattern(" dd MM yyyy");
        LocalDate tarih=LocalDate.parse(strTarih, f);

        //Gelen tarih bilgisini alıp istediğimiz formata çievirdik.
        // gerçek bir tarihe dönüştürük

        System.out.println("tarih = " + tarih);

        long starttime=System.currentTimeMillis();
        long finishtime=System.currentTimeMillis();
        System.out.println("gecen sure = " + (finishtime-starttime) + "ms");


    }
}
