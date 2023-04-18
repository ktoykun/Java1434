package Gun30._02_FinalVariables.Ornek1;

public class NufusMemurlugu {
    public static void main(String[] args) {
        Vatandas v1=new Vatandas("Kübra");
        Vatandas v2=new Vatandas("Osman");

        System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);

        // final atandıktan sonra değiştirilememeyi sağlıyor.
        // v1.tcNo=6006; haydaaa
        // final: değer atandıktan sonra değiştirmeyi engelliyor
        // static: heryeni nesneye farklı değer verilmesini sağlıyor

    }
}
