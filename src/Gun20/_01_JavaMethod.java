package Gun20;

public class _01_JavaMethod {
    public static void main(String[] args) {

        merhabaYaz();// giden yok. dönen yok.
        toplamYaz(4,5); // giden var. dönen yok.
        int enb= Math.max(5,9);// şimdi burada fonks. çalıştığında sana geriye bir şey veriyor.
        // ve verdiği şey bir şeye eşitlenebiliyor. bu şekilde bir şeye eşitlenebilen fonksiyonlar
        // döneni olan fonk. olarak isimlendirilir. çalışınca bir şey yazıyor olması
        // fonksiyonun döneni olduğu anlamına gelmez. çalışınca bir şey yazar zaten.
        // fonksiyon bir şeye eşitlenebiliyorsa dönen var demektir. çalışınca sana bir şey veriyor.
        double sayi=Math.random(); // gideni yok. döneni var.

        enbYAz(4,5);
        enb=enbbul(4,5);
        System.out.println("enb = " + enb);


    }

    public static int enbbul(int a, int b) { // dönecek şeyin tipi yazılır.
        // void tipsiz demek. sildik.intten önce void yazıyordu.

        int dönecek=0;
        if ( a<b)
            dönecek=b;
        else
            dönecek=a;

        return dönecek; // artık geriye bir şey dönderdiği için void değil. artık tipi va.
        // yani return varsa bir şeye eşitlenebilir hale gelmiş oluyor. main de sonucunu alabiliriz artık.
        // geriye ne dönderiyorsa void yerine onun tipini yazıyoruz. artık yukarıda bir şeye eşitlenebilir hale geldi.
    }

    public static void enbYAz (int a, int b){ // bunlara void demeye devam. çünkü bunlar
        // yukarıya bir şey göndermiyor.
        if ( a<b)
            System.out.println(b);
        else
            System.out.println(a);


    }

    public static void merhabaYaz () {

    }

    public static void toplamYaz (int a, int b) {


    }


}
