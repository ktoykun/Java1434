package Gun39._01_OOP_Soru;

public abstract class Hayvan {// bastract metodları
    // zaten sadece abstract class da yazabiliriz

   private int id; // bu id, isim, d. tarihi kısımları classın fieldları
    // şimdi bunun benzersiz olması için bir final kelimesini ekliyoruz ve
    // aşağıya bir sayaç tanımlıyoruz.
   private String isim;
   private String dogumtarihi;
   private boolean vahsi;

    abstract void yemekmik(); // bunlar ise metodları. başına puclic koysaydık diğer metodlardan
    // ulaşılabilir olurdu. bu bir abstarct class olduğu için bu metodlar muhakkak abs. olmalı
    abstract void yiyecek(); ;
    abstract void uykusüresi();
    abstract void ses();

    public Hayvan(String isim, String dogumtarihi, boolean vahsi) {
       setIsim(isim);
       setVahsi(vahsi);
      // this.dogumtarihi = dogumtarihi;
      // this.vahsi = vahsi;
       this.id=idsayac++;
    }

    private static int idsayac=1;

    private int getId() {
        return id;
    }

    public String getDogumtarihi() {
        return dogumtarihi;
    }

    public void setDogumtarihi(String dogumtarihi) {
        this.dogumtarihi = dogumtarihi;
    }

    public boolean isVahsi() {
        return vahsi;
    }

    public void setVahsi(boolean vahsi) {
        this.vahsi = vahsi;
    }

    private void setId(int id) {
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    @Override
    public String toString() { // her iki classda to string olarak burayı kullanıyor
        System.out.println("yiyeceği"); yiyecek();
        System.out.println("yemek mik"); yemekmik();
        System.out.println("uyku süresi"); uykusüresi();
        System.out.println("sesi");ses();

        return "Hayvan{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                "dogum tarihi" +dogumtarihi +
                "vahsi mi" + vahsi;

    }

    public void dahaguzelbirifadeıcın() { // tostring kullanmak zorunad değilsin
        // böyle de yazdırabilirsin
            System.out.println("id = " + id);
            System.out.println("isim = " + isim);
            System.out.println("vahsi = " + vahsi);
            System.out.println("idsayac = " + idsayac);
            System.out.println("dogumtarihi = " + dogumtarihi);
            System.out.println("yiyeceği"); yiyecek();
            System.out.println("yemek mik"); yemekmik();
            System.out.println("uyku süresi"); uykusüresi();
            System.out.println("sesi");ses();

    }



}
