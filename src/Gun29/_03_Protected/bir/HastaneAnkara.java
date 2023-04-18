package Gun29._03_Protected.bir;

public class HastaneAnkara {
    public static void main(String[] args) {
        doktor dok1 =new doktor();
        dok1.adi="Kübra";
        dok1.bolumu="Estetik";
        dok1.hastanead="Ankara Hastanesi";

        // dok1.sicilno private buna erişemedik.

        doktor dok2=new doktor();

    }



}
