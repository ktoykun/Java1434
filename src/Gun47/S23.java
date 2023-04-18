package Gun47;

public class S23 {
    public static void main(String[] args) {
        String [][] chs =new String [2] [];
        chs[0]=new String[2]; // 2
        chs[1]=new String[5]; // 5
        int i=97;

        for (int a = 0; a <chs.length ; a++) {
            for (int b = 0; b <chs.length ; b++) {
                chs[a][b]=" "+i; // i'yi otomatik stringe çeviriyor
                i++;
             // 00 >> 97 01>> 98, 10 >> 99, 11>> 100
            }
            System.out.println();
        }

        for ( String [] ca :chs  ) {
            for (String c: ca ) {
                System.out.print(c + " ");

            }

            System.out.println();

        }
    }
}
