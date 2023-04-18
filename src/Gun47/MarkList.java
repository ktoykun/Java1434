package Gun47;

public class MarkList {
    int num;
    public static void graceMarks(MarkList obj4) {
        obj4.num +=10;

    }

    public static void main(String[] args) {
        MarkList obj1=new MarkList();
        MarkList obj2=obj1;
        MarkList obj3=null;
        obj2.num=60;
        graceMarks(obj2);

        // bu şekilde bir kodlamada kaç tane instance oluştu denir ise cevabımız
        // 1 olurdu. çünkü mark listten sadece bir tane oluştu. diğerleri yeni bir
        // değer, insan oluşmadı.insan sadece new deyince oluştu. diğerleri isim verdi
        // başka göbek adı koydu vs. Eğer soru referans sorsaydı 3 tane diyecektik.

    }
}
