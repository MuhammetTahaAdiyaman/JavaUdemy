//artık Kullanici class'ı içindeki nitelik ve operasyonları extends yaptığımız için hem öğrenci hem de ogretmen classı kullanabilir. hemen main içinde görelim.

public class Ogrenci extends Kullanici {
    //nitelikler
    private int kursSayisi;

    public Ogrenci(String kullaniciAdi, String sifre, int kursSayisi) {
        super(kullaniciAdi, sifre); //kullanici sinifi superclass (base class)
        this.kursSayisi = kursSayisi;
    }

    public int getKursSayisi() {
        return kursSayisi;
    }

    public void setKursSayisi(int kursSayisi) {
        this.kursSayisi = kursSayisi;
    }

    //operasyonlar

    public void puanVer(){
        System.out.println("Puan verildi");
    }


}
