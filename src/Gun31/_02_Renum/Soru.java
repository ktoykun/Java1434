package Gun31._02_Renum;

public class Soru {// Bir User yetkilendirme modülü yapılması isteniyor.
    // USER ROLÜ : ADMIN, MUDUR, SATIS, PERSONEL
    // USER STATUSU : AKTIF, PASIF
    // Yukarıdaki şekilde bir USER(username) class ı tanımlayınız
    // Farklı yetki ve statüde 2 kullanıcı ve bir de ADMIN
    // kullanıcısı tanımlayınız.
    // UserSilme isimli fonksiyona bu userları gönderiniz.
    // ADMIN kullanıcısı için bu user silinemez uyarısı verdirelim

    enum Role
    {
        Admin, Mudur, Satis, Personel;
    }

    enum Statu
    {
        Aktif, Pasif;
    }

    public static void main(String[] args) {

        User user1=new User("Kübra", Role.Admin, Statu.Aktif);
        User user2=new User("Osman", Role.Mudur, Statu.Pasif);
        User user3=new User("Furkan", Role.Satis, Statu.Pasif);

        userSil(user1);
        userSil(user2);
        userSil(user3);

        System.out.println("user1 = " + user1);
    }

    public static void userSil(User user){

        if (user.role == Role.Admin)
            System.out.println(user.username + " Admin silinemez");

    }

}
