package Gun46;

public class S18 {
    public static void main(String[] args) {
        String [][] chs=new String[5][2];
        chs[0]=new String[4];
        chs[1]=new String[5];

        int i=97;

        System.out.println("chs = " + chs.length);
        System.out.println("chs[0] = " + chs[0].length);//0. satır uzunluğu
        System.out.println("chs[1] = " + chs[1].length);//1. satır uzunluğu
        System.out.println("chs[2] = " + chs[2].length);//2. satır uzunluğu
        System.out.println("chs[3] = " + chs[3].length);//3. satır uzunluğu
        System.out.println("chs[4] = " + chs[4].length);//4. satır uzunluğu

        for (int a= 0; a <chs.length ; a++) { // 5- a: 0,1,2,3,4
            for (int b = 0; b < chs[a].length ; b++) {
                chs[a][b]=" "+i; // 00>>44 // 0. satırın 4. elemanı yok
                i++;

            }

            for (String [] ca :chs   ) {
                for ( String c:ca) {
                    System.out.print(c+" ");

                }
                System.out.println();

            }

        }
    }
}
