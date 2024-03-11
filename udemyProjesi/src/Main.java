//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Ogrenci ogrenci = new Ogrenci("admin","123456",12);
        ogrenci.girisYap(ogrenci.getKullaniciAdi(), ogrenci.getSifre());

        Ogretmen ogretmen = new Ogretmen("admin","123456",234,4.0,2000);
        ogretmen.girisYap(ogretmen.getKullaniciAdi(),ogretmen.getSifre());
    }
}