//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Urun urun = new Urun("Monster cd123","Bilgisayar",2400,1234567,51);
        UrunYonetimi urunYonetimi = new UrunYonetimi(urun);

        urunYonetimi.ekle();
    }
}