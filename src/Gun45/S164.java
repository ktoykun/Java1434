package Gun45;

public class S164 {
    public static void main(String[] args) {
        int data[]={2010, 2013, 2014, 2015, 2014};
        int key=2014;
        int count=0;

        for (int e: data ) {
            if ( e != key){
            continue;
            }

            // count++; continue dan sonra çalışma şansı yok. hiçbir zaman.
            // bu koda ulaşılamaz. compile error
    }

        System.out.println(count + "found");
}

}
