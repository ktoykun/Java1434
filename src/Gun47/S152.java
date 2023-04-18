package Gun47;

public class S152 {
    public static void main(String[] args) {

        int n [] [] ={{1,3}, {2,4}};

        for (int i = n.length-1; i >=0 ; i--) {

            for (int y : n[i]   ) {// önce n[1]'i yani 2,4 yazar sonra n[0]'ı 1,3 yazar
                System.out.println(y);

            }

        }

    }
}
