package Gun19;

public class _05_JavaMethod {
    // buraya methodlar yazılabilir.

    public static void main(String[] args) {

        // burası ise ana methoddur. diğer methodları bradan çağırırız.

        Math.max(5, 6); // bu bir method. bir şeyler veriyorsun. sana çıktı veiryor.
        // veri alıp veri veriyor.

        Math.random(); // bu veri almıyor. sadece veri veriyor.

        // işte böyle methodların tipleri var. veri alan ve geri gönderen. sadece veri alan vs.

        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world"); // böyle uzun uzun yazmak yerine.
        // aşağıda bir kere tanımladık. ve sonra aşağıdaki gibi çağırıdık.

        merhabaYaz();
        merhabaYaz();
        merhabaYaz(); // 6 tane yazdırdı. 3 tanesini yukarıda
        // elimizle girdik.3ünü aşağıda metoddan çapırdık.

    }

    public static void merhabaYaz() {
        System.out.println("Hello World");

        //buraya methodlar yazılabilir. yukarıdaki main kısmını aldık kopyaladık.
        //ismini biz verdik. parantez ve süslü parantez şart.
        //metodlar tekrarlayan kodlardan kurtulmak için. bir kere yazıp sonra tekrar
        //çağırmak için ve büyük programı parçalara bölüp kod karışıklığının önüne geçmek için
        //kullanılır. temiz kod. temiz yazılım.
    }


}
