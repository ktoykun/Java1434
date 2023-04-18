package Gun30._01_StaticVariables.Ornek2;

public class School {
    public static void main(String[] args) {
        Student ogr1=new Student(1, "Kübra Toykun");
        Student ogr2=new Student(2, "Nurten Toykun");
        Student ogr3=new Student(3, "Furkan Toykun");
        // problem: hem id yi takip etmek zorundayım.hata olasılığı yüksek.


        Student ogr10=new Student("Kübra Toykun");
        Student ogr11=new Student("Nurten Toykun");
        Student ogr12=new Student("Furkan Toykun");
        System.out.println("ogr10 = " + ogr10);
        System.out.println("ogr11 = " + ogr11);
        System.out.println("ogr12 = " + ogr12);


    }
}
