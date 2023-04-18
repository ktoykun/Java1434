package Gun19;

public class _01_Java2dArrays {
    public static void main(String[] args) {
        int [] [] tablo= {{3 ,4 , 55}, {234, 22, 33}}; // 2 satır 3 sütun



        System.out.println("satır uzunluğu = " + tablo.length); // 2
        System.out.println("0. satırın sütun uzunluğu = " + tablo[0].length); //3
        System.out.println("1. satırın sütun uzunluğu = " + tablo[1].length); //3


        for (int i = 0; i <tablo.length ; i++) { // satır sayısı

            for (int j = 0; j <tablo[i].length ; j++) { // ilgili satırdaki sütun uzunluğu
                System.out.print(tablo[i][j]+ "\t" );
            }

            System.out.println();

        }
    }
}
