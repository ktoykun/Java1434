package Gun39._04_OOP_Soru;

class C{ // dede
    public C() {
        System.out.println("C");
    }
}

class B extends C { // baba
    public B () {
        System.out.println("B");
    }
}

class A extends B { // evlat
    public A () {
        super(); // bu görünmüyor ama hep var. bunu sout'un altına yazsan izin vermez
        // çünkü önce bu çalışır. önce süper çalışır sonra diğeri.
        System.out.println("A");
    }
}

public class Soru {
    public static void main(String[] args) {
        A a=new A();

    }
}
