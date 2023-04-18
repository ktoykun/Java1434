package Gun43;

public class _07_JavaCheckedAndUncheckedExceptions {
    public static void main(String[] args) {
        // Checked ve Unchecked Exception
        // Java derki yani yazılımcı bıraktığı hatalara UnChecked exception
        // Ama öyle komutlar var ki bana ait: bunları hata kontrolü yapmadan
        // yani try-catch e almadan kullanmana izin VERMEM. bu gibi hat durumlarına
        // CHECKED yani kontrol ettiğim hatalar denir.
        String str = "";

        char ilkharf=str.charAt(0);
        // sen bilirsin ister try catch yap ister yapma

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e){

            System.out.println("Hata oluştu");
        }
    }
}