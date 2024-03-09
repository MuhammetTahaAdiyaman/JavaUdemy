public class Ogrenci {
    private String ad;
    private String soyad;
    private int okulNo;
    private int dogumYili;

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getOkulNo() {
        return okulNo;
    }

    public void setOkulNo(int okulNo) {
        this.okulNo = okulNo;
    }

    public int getDogumYili() {
        return dogumYili;
    }

    public void setDogumYili(int dogumYili) {
        this.dogumYili = dogumYili;
    }

    public void bilgileriGoster(){
        System.out.println(this.ad);
        System.out.println(this.soyad);
        System.out.println(this.okulNo);
        System.out.println(this.dogumYili);
    }

    //yukarıdaki aynı işlemi gören toString() metodunu oluşturalım.

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", okulNo=" + okulNo +
                ", dogumYili=" + dogumYili +
                '}';
    }
}
