package Gun29.Soru;

public class Hesap {
     private int yatan=0;
     private int cekilen=0;
     private int bakiye=0;

     void paraYatir(int yatanpara)
     {    yatan+=yatanpara;
          bakiye+=yatanpara;


     }
     void paracek(int cekilenpara)
     {    cekilen-=cekilenpara;
          bakiye-=cekilenpara;


     }

     @Override
     public String toString() {
          return "Hesap{" +
                  "yatan=" + yatan +
                  ", cekilen=" + cekilen +
                  ", bakiye=" + bakiye +
                  '}';
     }

}



