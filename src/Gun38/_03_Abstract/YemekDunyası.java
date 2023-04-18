package Gun38._03_Abstract;

public class YemekDunyası {
    public static void main(String[] args) {
        Baklava bak=new Baklava();
        bak.taste();
        bak.MadeIn();
        System.out.println("bak = " + bak);


        GreekSalad salad=new GreekSalad();
        salad.MadeIn();
        salad.taste();
        System.out.println("salad = " + salad);

        Cheesecake kek=new Cheesecake();
        kek.MadeIn();
        kek.taste();
        System.out.println(kek);
    }
}
