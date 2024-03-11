public interface IKullanici {
    //burada methodların imzasını yani isimlerini belirledik. Bunu kalıtacak her alt class'a bunu kendilerine göre özelleştirmesini zorunlu hale getirdim.

    public void girisYap(String kullaniciAdi,String sifre);
    public void kayitOl();
    public void mesajGonder();
}
