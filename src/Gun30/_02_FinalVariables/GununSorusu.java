package Gun30._02_FinalVariables;

public class GununSorusu {
    int a;
    static int b; // sen bi'tanesin dedik. bu değer bu classın bir tanesidir.

    void artir()

    {
        a++;
        b++;

    }

    public static void main(String[] args) {
        GununSorusu gs1=new GununSorusu();
        gs1.a=5;
        
        GununSorusu  gs2=new GununSorusu();
        gs2.a=7;
        
        // a nın değeri kaçtır?
        // bu soruya karşılık şu soru sorulmalı. Hangi a nın?
        // burada a static değil. dolayısıyla her nesnenin bir a'sı var.

        System.out.println("gs1 = " + gs1.a); // 1'in a sı.
        System.out.println("gs2 = " + gs2.a); // 2'nin a sı.
        
        // b nin değeri kaçtır?
        // b static ve bir tanedir.
        System.out.println("GununSorusu.b = " + GununSorusu.b);

        gs1.artir(); // gs1.a>>6 , b=1
        gs2.artir(); // gs.2a>>8 , b=2

        System.out.println("gs1 = " + gs1.a);
        System.out.println("gs2 = " + gs2.a);
        System.out.println("b = " + b);

    }
}
