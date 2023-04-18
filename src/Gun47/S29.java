package Gun47;

import java.util.ArrayList;

public class S29 {
    public static void main(String[] args) {
        ArrayList<Integer> points=new ArrayList<>();
        points.add(1);
        points.add(2); // bunu siler.
        points.add(3);
        points.add(4);
        points.add(null); // Integer, null değer alabilir.büyük harfle başlayanlar alabilir.

        System.out.println("points = " + points);
        points.remove(1); // java bunu index kabul ediyor. sayı dışında bir şey verirsen
        // o nesnenin kendisini siler.

        System.out.println("points = " + points);

        // rakam olarak 1 silmek isteseydik onun başına (Object) koymamız lazımdı.şöyle ki;

        points.remove((Object)1);// değer olarak 1 i siler. 1 in kendisini siler.
        System.out.println("points = " + points);


    }

}
