package Gun38._03_Abstract;

public  class GreekSalad extends Salad {

    @Override
    public String toString() {
        return "GreekSalad{}";
    }

    @Override
    public void MadeIn() {
        System.out.println("Yunan menşeili");

    }

    @Override
    public void taste() {
        System.out.println("ekşi, limonlu, sirkeli");
    }
}
