public class Ogretmen extends Kullanici { //senin baban Kullanicidir demiş olduk.
    private int ogretmenNo;
    private double puan;
    private int bakiye;

    public Ogretmen(String kullaniciAdi, String sifre, int ogretmenNo, double puan, int bakiye) {
        super(kullaniciAdi, sifre);
        this.ogretmenNo = ogretmenNo;
        this.puan = puan;
        this.bakiye = bakiye;
    }

    public int getOgretmenNo() {
        return ogretmenNo;
    }

    public void setOgretmenNo(int ogretmenNo) {
        this.ogretmenNo = ogretmenNo;
    }

    public double getPuan() {
        return puan;
    }

    public void setPuan(double puan) {
        this.puan = puan;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }

    public void ogrencileriListele(){
        System.out.println("Ogrenciler listelendi");
    }

    public void paraCek(int miktar){
        this.bakiye = this.bakiye - miktar;
        System.out.println("Para cekildi"+miktar);
    }
}
