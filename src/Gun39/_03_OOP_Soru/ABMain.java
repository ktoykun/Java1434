package Gun39._03_OOP_Soru;

public class ABMain {
    public static void main(String[] args) {
        A a=new A();
        System.out.println("a.mesaj = " + a.mesaj); // A'dan merhaba
        
        B b=new B();
        System.out.println("b.mesaj = " + b.mesaj); // B'den türettik. A'ya hiçbir etki etmedi bu
        // bununla yukarıdakinin bir ilgisi yok artık birbiri ile
        
        A a2=new A();
        System.out.println("a2.mesaj = " + a2.mesaj); // yeni bi tane oluşturduk. static değil yeni bir tane oluştu.
        
    }
}
