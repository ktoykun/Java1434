package Odevler.Diziler;

public class OdevDiziSoru13 {
    public static void main(String[] args) {

        // Bu şekilde bir String oluşturunuz.  "$12 $23 $10 $2 $5 $2"
        //$ işaretlerini kaldırın ve sayıları toplayın.
        //Sayıların toplamını yazdırın.

        String cumle= "$12 $23 $10 $2 $5 $2";
        String [] dizi=cumle.split(" ");

          for (int i = 0; i <cumle.length() ; i++) {
            dizi[i]=dizi[i].replace("$", "");
              System.out.println(cumle);

        }





    }
}
