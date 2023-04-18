package Gun39._01_OOP_Soru;

public class HayvanMain { // güvenli dizayn
    // encapsulation demektir.
    public static void main(String[] args) {

        Kedi miyav=new Kedi("köpük", "2020" , false);
        miyav.dahaguzelbirifadeıcın();
       // System.out.println(miyav);


        Kartal kartal=new Kartal("şahin", "2023", true);
        kartal.dahaguzelbirifadeıcın();
       // System.out.println(kartal);


    }
}
