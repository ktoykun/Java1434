package Gun47;

import java.util.ArrayList;
import java.util.List;

public class S48 {
    public static void main(String[] args) {
      List colors=new ArrayList();

      colors.add("Green");
      colors.add("Blue");
      colors.add("red");
      colors.add("yellow");
      colors.remove(2);
      colors.add(3, "cyan"); // listenin son indexi bu olduğu için en sona ekler sorun olmaz
        // ama 4 yazsaydı ekleyemezdi çünkü öyle bir index yok.
        System.out.println("colors = " + colors);


    }
}
