package Gun38._02_Abstract;

public class GeometriMain {
    public static void main(String[] args) {

        Dikdörtgen d=new Dikdörtgen(4,5);
        d.setName("Yeni dikdörtgen");
        d.ciz();
        System.out.println("d = " + d);


        Daire daire=new Daire(3);
        daire.setName("yeni daire");
        daire.ciz();
        System.out.println("daire = " + daire);

    }
}
