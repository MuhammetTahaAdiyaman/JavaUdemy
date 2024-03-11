public class Yonetici implements IKullanici{

    @Override
    public void girisYap(String kullaniciAdi, String sifre) {
        System.out.println("Yönetici giris yaptı"+kullaniciAdi+" "+sifre);

    }

    @Override
    public void kayitOl() {
        System.out.println("Yönetici kayıt oldu");

    }

    @Override
    public void mesajGonder() {
        System.out.println("Yönetici mesaj gönderdi");

    }
}
