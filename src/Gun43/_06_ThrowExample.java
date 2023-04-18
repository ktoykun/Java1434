package Gun43;

import java.util.Scanner;

public class _06_ThrowExample {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.println("Yeni Şifre Oluşturma");

        System.out.println("Yeni Şifreniz: ");
        String newPassword= oku.nextLine();

        if (newPassword.length()<8) {
            System.out.println("Lütfen Dikkat");
            // log tutma: kullanıcı 8 karakterden az deneme yaptı
            // bunları günlük gibi tutar
    }
        if (newPassword.length()>15) {
            System.out.println("Lütfen Dikkat !");
            System.out.println("Şifre en fazla 15 karakter olabilir");
        }

        }

}
