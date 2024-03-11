public class Ogrenci extends Kullanici{
    private int kursSayisi;

    public Ogrenci(String kullaniciAdi, String sifre, int kursSayisi) {
        super(kullaniciAdi, sifre);
        this.kursSayisi = kursSayisi;
    }

    public int getKursSayisi() {
        return kursSayisi;
    }

    public void setKursSayisi(int kursSayisi) {
        this.kursSayisi = kursSayisi;
    }

    public void puanVer(){
        System.out.println("puan verildi");
    }

    @Override
    public void girisYap(String kullaniciAdi, String sifre) {
        if(kullaniciAdi.equals("admin") && sifre.equals("123456")){
            System.out.println("giriş başarılı. Öğrenci paneline yönlendiriliyorsunuz");
        }else{
            System.out.println("giriş başarısız");
        }
    }
}
