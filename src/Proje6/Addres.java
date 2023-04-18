package Proje6;

import java.util.ArrayList;
import java.util.Arrays;

public class Addres {

    private static ArrayList<String> cityList = new ArrayList<>(Arrays.asList("New York", "New Jersey", "Ohio", "Pennsylvania", "Washington", "Atlanta"));
    public static ArrayList<String> getCityList() {
        return cityList;
    }

     /*

        Address class i içerisinde değiştirmemiz gereken bir şey yoktur.

        Addressleri bir veritabanı olarak düşünebiliriz ve bu veritabanı içerisindeki adreslere sadece kargolama
    yaptığımızı var sayıyoruz.




    private static ArrayList<String> cityList = new ArrayList<>(Arrays.asList("New York", "New Jersey", "Ohio", "Pennsylvania", "Washington", "Atlanta"));

    public static ArrayList<String> getCityList() {
        return cityList;
    }*/
}
