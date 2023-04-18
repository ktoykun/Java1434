package Gun31._01_Renum;

public class Ornek1Cozum {

    enum Aylar{
        Tanimsiz, OCAK, ŞUBAT,MArt, Mayıs, Nisan, HAziran, TEmmuz,
        Ağustos, Eylül,Ekim,KAsım, Aralık;
    }

    //  Tanımlanan değişkenlerin sabit değer alması için kullanılır. Tanımlanan bu sabit değerler bir grup oluşturur.
    //  Erişilmesi, yönetilmesi ve anlaşılması kolay hale gelir.
// Yazılım dillerinde enum, enumaration ve enum sabitleri
// olarak adladırılmaktadır. Tanımlanan değişkenlerin
// sabit değer alması için kullanılır. Tanımlanan
// bu sabit değerler bir grup oluşturur. Erişilmesi,
// yönetilmesi ve anlaşılması kolay hale gelir.

//bir sürü girilmesi gereken datayı  tek seferde
// parti halinde giriyoruz,daha sonra kullanması
// da kolay yazması da kolay oluyor

    public static void main(String[] args) {
        Aylar ay=Aylar.Mayıs;

        switch (ay){
            case ŞUBAT:System.out.println(28); break;
            case OCAK:
            case MArt:
            case Mayıs:
            case TEmmuz:
            case Ağustos:
            case Ekim:
            case Aralık: System.out.println(31); break;
            case Nisan:
            case HAziran:
            case Eylül:
            case KAsım:System.out.println(30); break;
            // kontrol zor hataya açık
            // Boolean True 1,  False 0

        }

        if (ay==Aylar.Mayıs){
            System.out.println("zam yapıldı");
        }

        System.out.println("ay = " + ay); // to string
        System.out.println("ay.name = " + ay.name());
        System.out.println("ay = " + ay.ordinal());

        for (Aylar a: Aylar.values());
    }
}
