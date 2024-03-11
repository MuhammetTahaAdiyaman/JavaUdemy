public class Ogrenci implements IKullanici{

    @Override
    public void girisYap(String kullaniciAdi, String sifre) {
        System.out.println("Ogrenci giris yaptı"+kullaniciAdi+" "+sifre);
    }

    @Override
    public void kayitOl() {
        System.out.println("Ogrenci kayıt oldu");
    }

    @Override
    public void mesajGonder() {
        System.out.println("Öğrenci mesaj gönderdi");
    }

    public void sikayetEt(){
        System.out.println("Öğrenci şikayet etti");
    }
}
