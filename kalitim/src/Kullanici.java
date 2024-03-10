public class Kullanici {
    private String kullaniciAdi;
    private String sifre;

    public Kullanici(String kullaniciAdi, String sifre) {
        this.kullaniciAdi = kullaniciAdi;
        this.sifre = sifre;
        if(kullaniciAdi.equals("admin")&&sifre.equals("123456")){
            System.out.println("giriş başarılı");
        }else{
            System.out.println("Giriş başarısız");
        }
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }



    public void mesajGonder(){
        System.out.println("Mesaj gonderildi.");
    }

}
