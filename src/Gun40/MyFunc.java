package Gun40;

public class MyFunc {


    public static void bekle(int sn)

    { try {
        Thread.sleep(1000 * sn); // milisaniye cinsinden bekler

    }  catch (InterruptedException e) {
        throw new RuntimeException(e);



} }



}
