package Odevler.WhileDoWhileForBreakContinueOdev;

import java.util.Scanner;

public class _01_Projects {
    public static void main(String[] args) {
        Scanner scanStr = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz: ");
        String isim = scanStr.nextLine();

        isim=isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase();

        System.out.println(isim+" hoşgeldin. Soyismini girer misin?");
        String soyisim = scanStr.nextLine();
        soyisim=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).toLowerCase();

        System.out.println(isim+" "+soyisim+" Adınız doğru ise y tuşuna basınız");
        String key=scanStr.next();

        while (!key.equalsIgnoreCase("y")){
            System.out.println("Tercihinizi dogru yapmadiniz...Lutfen tekrar deneyin...");
            key=scanStr.next();
        }

        System.out.println("Isim ve Soyisminiz sisteme basarili bir sekilde kayit edilmistir...");

        System.out.println("Lütfen kullanıcı adınızı arasında boşluk olmadan giriniz");
        String username = scanStr.next();

        System.out.println("Lütfen şifrenizi belirleyiniz");
        String password = scanStr.next();

        System.out.println("Lütfen şifrenizi tekrar giriniz");
        String passwordControl = scanStr.next();

        while (!password.equals(passwordControl)){
            System.out.println("Yanlis veya hatali bir sifre girdiniz, lutfen tekrar deneyin...");
            passwordControl=scanStr.next();
        }

        System.out.println("Tebrikler... "+ username + "kullanici adiyla sisteme kayit oldunuz...");



    }
}
