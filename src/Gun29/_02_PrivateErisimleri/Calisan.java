package Gun29._02_PrivateErisimleri;

public class Calisan {
    int id;         // default
    String name;    // default
    String surname; // default

    private String password;

    // sadece bulunduğ klastan erişim var.

    public void sifreAta(String sifre)
    {
        // şifreyi kontrol ederek atayacağım.
        if (sifre.length()<8){
            System.out.println("zayıf şifre");
        }
        else {
            this.password=sifre;
            System.out.println("şifre başarılı");
        }
    }


        public void SifreGoster()
        {
            System.out.println("*****" + password.substring(4));

        }

    }


