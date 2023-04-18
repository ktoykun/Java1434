package Gun30._01_StaticVariables.Ornek2;

public class Student {
    int id;
    String fullname;

    static int sayac=1;

    // static olmadan herzaman 0 la başlıyordu
    // static olduğunda artık bir tane oladuğundan
    // değerini korudu ve hep 1 tane arttı
    // tüm nesnelere ait olan bilgileri veya
    // sayac gibi işlemler için static kullanılır.

    public Student (int id, String fullname){
        this.id=sayac++; // once var olan deger veriyor
        this.fullname=fullname;

    } // maindeki ilk 3 satır için gerekli.
    // statik değişkenden sonra gerek kalmadı.

    public Student (String fullname) {
        this.id=sayac++;
        this.fullname=fullname;


    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fullname='" + fullname + '\'' +
                '}';
    }
}

