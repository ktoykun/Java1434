package Gun43;

public class _05_TryCatchFinally {
    public static void main(String[] args) {
        long startTime=0;
        String str="";

        try {
            startTime=System.currentTimeMillis();
            System.out.println("Hatadan önceki kısım");
            char ilkharf=str.charAt(0);
            System.out.println("Hatadan sonraki kısım");
        }catch (Exception ex){
            System.out.println("catch bloğu çalıştı");
            // hata olduğunda yapılacaklar

        }
       finally { // hata olsa da olmasa da çalışır.bu bölüm
            // yukarıdaki süreçle ilgili olduğunu göstermek
            // için finally içinde yazılır
            long gecensure=System.currentTimeMillis()-startTime;
            System.out.println("gecensure = " + gecensure);
            System.out.println("try catch bloğun ile ilgili son yapılacaklar");
        }

        System.out.println("diğer çalışan kodlar");

        System.out.println("program sonu");
    }
}
