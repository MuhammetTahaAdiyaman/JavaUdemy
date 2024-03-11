public class Ogrenci {
    //biz önceden field ile methodları aynı class içinde yazardık artık bu ikisini ayıracağız.
    //fieldları bir class içinde methodları manage denilen başka bir class içinde yazacağız.
    public String ad;
    public String soyad;
    public String no;
    public String babaAdi;
    public String anaAdi;
    public String dogumTarihi;

    //şimdi bir constructor oluşturalım

    public Ogrenci(String ad, String soyad, String no, String babaAdi, String anaAdi, String dogumTarihi) {
        this.ad = ad;
        this.soyad = soyad;
        this.no = no;
        this.babaAdi = babaAdi;
        this.anaAdi = anaAdi;
        this.dogumTarihi = dogumTarihi;
    }
}
