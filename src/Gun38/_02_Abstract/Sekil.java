package Gun38._02_Abstract;

public abstract class Sekil {
    // başka türlü içi boş olan bir metodu
    // yazamazdık. abstract olmalı. abstract olduğu için
    // daire ve dikdörtgen için
    // interface yapmaya gerek kalmıyor.

    private String name;
    abstract double alan(); // burada interfaceden farklı olarak başına abstract ekliyoruz
    abstract double cevre();// soyut-abstarct

    public void ciz(){ // işte bu metod, dolu metod. somut metod. yukarıdakinden farkı bu.
        System.out.println(name+ "isimli şekil çizildi");

    }

    @Override
    public String toString() {
        return "Sekil{" +
                "name='" + name + '\''
                +"alan='" + alan()+
                "cevre='" + cevre()+
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    }

