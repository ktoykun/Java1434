package Odevler.Diziler;

public class OdevDiziSoru12 {
    public static void main(String[] args) {
        // String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
        // Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
        //Eğer aitse "true" çevirin.
        //Loops (döngüler) kullanın.


        String [] arr={"Apple" , "Orange", "Banana", "Pineapple"};
        for (int i = 0; i < arr.length ; i++) {
             if (arr [i].equals("Apple")){
            System.out.println("true");
        }



    }
}}
