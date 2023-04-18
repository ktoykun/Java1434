package Gun38._01_Abstract;

public class Ford extends BınekOto {
    public Ford(String marka, int uretimyılı, int bitesayısı) {
        super(marka, uretimyılı, bitesayısı);
    }

    @Override
    public int hızlanmasuresi() {

        return 0;
    }
    //Konunun olayı şu: eğer birer tane class ve interface olacaksa
    // java bir kolaylık sağlıyor ve bunları ayrı ayrı
    // classlarda yazmak yerine tek bir klassta abstarct metoduyla
    // tutabilirsin diyor. böylelikle yukarıda "implements IBınekOto "
    // demeye  gerek kalmıyor.




}
