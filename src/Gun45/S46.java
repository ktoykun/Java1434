package Gun45;

public class S46 {
    public static void main(String[] args) {

        String names []={"Thomas", "Peter", "Joseph"};

        String pwd[] =new String[3]; // 3 elemanlı boş dizi tanımladık

        int idx=0;

        try {
            for (String n: names){
                pwd [idx] =n.substring(2,6); //pwd [0]=omas, pwd [1] ve pwd [2] boş
                idx++;
            }
        }catch (Exception e){
            System.out.println("Invalid Name"); // önce bunu yazacak.
            // yazdırmanın nerede olduğuna çok dikkat et lütfen
        }

        for (String p : pwd) // pwd nin biri doldu diğerleri kaldı. bunu başta yazdırsaydık
            // 3 tane null yazacaktı.
            System.out.println(p);
    }
}
