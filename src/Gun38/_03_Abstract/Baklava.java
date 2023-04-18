package Gun38._03_Abstract;

public class Baklava extends Sweet {


    @Override
    public String toString() {
        return "Baklava{}";
    }

    // baklava kendisine kalan metodu almak zorunda
    // o da taste. diğerini de ister al ister alma(madein)
    @Override
    public void MadeIn() {
        System.out.println("Türkiye Menşeili");

    }
}
