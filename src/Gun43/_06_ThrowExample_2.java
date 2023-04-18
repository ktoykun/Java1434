package Gun43;

import java.util.Scanner;

public class _06_ThrowExample_2 {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.println("Yeni Şifre Oluşturma");

        System.out.println("Yeni Şifreniz: ");
        String newPassword= oku.nextLine();

        try {
            if (newPassword.length()<8)
                throw new Exception("Şifre en az 8 karakterden oluşmalı");
                // hatayı aşağıdaki hata loguna at diyoruz.
            if (newPassword.length() >15)
                throw new Exception(" Şifre en fazla 15 karakter olabilir");
        } catch (Exception ex){
            //hatalar bir yere toplanıp, hepsi için yapılması gereken
            // işlemler bir arada burada yapılabilir.mesela log tutma gibi
            System.out.println("Lütfen Dikkat ! ");
            System.out.println(ex.getCause());
        }
    }
}
