package Gun45;

public class S114 {
    public static void main(String[] args) {
        int number [];
        number=new int[2];
        number[0]=10;
        number[1]=20;


        number=new int[4]; // new dediği anda önceki atananların hepsi gidiyor.
        number [2]=30;
        number[3]=40;

        for (int x :number ) {
            System.out.println(" " + x);

        }

    }
}
