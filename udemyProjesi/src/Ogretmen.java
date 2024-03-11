public class Ogretmen extends Kullanici {
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
        System.out.println("Öğrenciler listelendi");
    }

    public void paraCek(int miktar){
        this.bakiye-=miktar;
        System.out.println("Para çekildi"+miktar);
    }

    @Override
    public void girisYap(String kullaniciAdi, String sifre) {
        if(kullaniciAdi.equals("admin") && sifre.equals("123456")){
            System.out.println("giriş başarılı.Öğretmen paneline yönlendiriliyorsunuz");
        }else{
            System.out.println("giriş başarısız");
        }
    }
}
