package Gun47;

public class MyField {

    int x; // default değeri 0
    int y; // default değeri 0

    public void doStuff(int x, int y){
        x=x; // parametreyi parametreye atadı nesnenin değeri değişmedi. bu x parametredeki x i temsil ediyor.
        y=this.y; // nesnenin y değeri değişmedi. bu this yukaırdaki int değerini temsil ediyor.
        // onun default değerini aldı. // this yazarsak yukarıdaki nesneyi alıyor
        // yazmazsak parametre olarak algılıyor.

    }

    public void display(){
        System.out.println(x + " " + y + " : ");

    }

    public static void main(String[] args) {
        MyField m1=new MyField();
        m1.x=100; // burada zaten değeri
        m1.y=200;

        MyField m2=new MyField();
        m2.doStuff(m1.x, m1.y);

        m1.display(); //100 200
        m2.display(); // 0 0
    }
}
