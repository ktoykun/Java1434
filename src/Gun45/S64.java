package Gun45;

public class S64 {
    public static void main(String[] args) {
        String [] arr={"A", "B", "C", "D"};

        for (int i = 0; i <arr.length ; i++) {
            System.out.println( arr[i] + " ");

            if (arr[i].equals("C")){ // ilk adımda burası çalışmadı
                continue; // bu break olduğu için çalışmıyor. continue kendinden sonra
                // gelenleri pas geçiriyor.
            }

            System.out.println("Work Done");
            break;
            // break olmasaydı
            // A work done
            // B work done
            // C
            // D work done yazardı.

        }
    }
}
