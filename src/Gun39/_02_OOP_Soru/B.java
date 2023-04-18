package Gun39._02_OOP_Soru;

public class B extends A {

    public B() { // constractor ekledik. bu çalıştığı zaman A'daki static olanı
        // değiştirir.çünkü extend aldı ondan.
        mesaj="B'den merhaba"; // mesajın değeri artık B'den merhaba.
        // artık bi tane olan bu
    }
}
