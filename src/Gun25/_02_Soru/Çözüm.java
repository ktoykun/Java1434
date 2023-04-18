package Gun25._02_Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class Çözüm {
    public static void main(String[] args) {
        Scanner okuint=new Scanner(System.in);
        Scanner okuStr=new Scanner(System.in);
        ArrayList<ögrenci> sınıf=new ArrayList<>();

        for (int i = 0; i < 3 ; i++) {
            ögrenci ogr1=new ögrenci();

            System.out.println("Ogrenci adı giriniz: ");
            ogr1.adı = okuStr.nextLine();

            System.out.println("Ogrenci soyadı giriniz: ");
            ogr1.soyadı = okuStr.nextLine();

            System.out.println("Ogrenci sınıfı giriniz: ");
            ogr1.sınıf = okuint.nextInt();

            System.out.println("Ogrenci adresi giriniz: ");
            ogr1.adres=okuStr.nextLine();

            sınıf.add(ogr1);

        }

        for (ögrenci ogr : sınıf){ // sağ tarafına değişkenlerin içinde olduğu dizi olan hali yazılır
            // burda sınıf. onun soluna da içinde olan şeyleri yazıyorsun.herhangi birini alıp verir.
            System.out.println("ogr. adı = " + ogr.adı);
            System.out.println("ogr.soyadı = " + ogr.soyadı);
            System.out.println("ogr.sınıfı = " + ogr.sınıf);
            System.out.println("ogr. adresi = " + ogr.adres);

        }

        // array list tanımlayıp for döngüsü ekleyince aşağıdaki gibi
        // ayrı ayrı girmeye gerek kalmıyor.

      /*  ögrenci ogr2=new ögrenci();
        System.out.println("Ogrenci adı giriniz: ");
        ogr2.adı = okuStr.nextLine();

        System.out.println("Ogrenci soyadı giriniz: ");
        ogr2.soyadı = okuStr.nextLine();

        System.out.println("Ogrenci sınıfı giriniz: ");
        ogr2.sınıf = okuint.nextInt();

        System.out.println("Ogrenci adresi giriniz: ");
        ogr2.adres=okuStr.nextLine();


        ögrenci ogr3=new ögrenci();
        System.out.println("Ogrenci adı giriniz: ");
        ogr3.adı = okuStr.nextLine();

        System.out.println("Ogrenci soyadı giriniz: ");
        ogr3.soyadı = okuStr.nextLine();

        System.out.println("Ogrenci sınıfı giriniz: ");
        ogr3.sınıf = okuint.nextInt();

        System.out.println("Ogrenci adresi giriniz: ");
        ogr3.adres=okuStr.nextLine();

        System.out.println("ogr1 = " + ogr1);

       */

    }

}

class ögrenci { // bu elemanlara; properties, field, özellik denebilir.
    String adı;
    String soyadı;
    int sınıf;
    String adres;

}