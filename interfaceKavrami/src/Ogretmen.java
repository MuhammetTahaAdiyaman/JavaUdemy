public class Ogretmen implements IKullanici{

    @Override
    public void girisYap(String kullaniciAdi, String sifre) {
        System.out.println("Ogretmen giris yaptı"+kullaniciAdi+" "+sifre);

    }

    @Override
    public void kayitOl() {
        System.out.println("Ogretmen kayıt oldu");

    }

    @Override
    public void mesajGonder() {
        System.out.println("Ogretmen mesaj gönderdi");

    }
}
