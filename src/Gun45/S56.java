package Gun45;

public class S56 {
    public static void main(String[] args) {
        String names[] = {"Thomas", "Peter", "Joseph"};
        String pwd[] =new String[3];
        int idx=0;

        try {
            for (String n : names){ // foreach ile names den alıp pwd ye atacak
                pwd[idx]=n.substring(2, 6); // 2 dahil 6 hariç: 2 3 4 5.//
                // 2 ve 6 arası index namesde her elemanda çalışmayacak
                System.out.println(pwd[idx]); // omas
                idx++;
        }

        }catch (Exception e)

        {
            System.out.println("Invalid Name");
        }
    }       // for burada döngüye devam etmez.for döngüsü try ın dışında olsaydı
            // devam ederdi.

}
