//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Ogrenci ogrenci = new Ogrenci("admin","12345",12);
        Ogretmen ogretmen = new Ogretmen("admin","123456",471,4.0,135);

        ogrenci.getKullaniciAdi();
        System.out.println(ogretmen.getKullaniciAdi());
    }
}