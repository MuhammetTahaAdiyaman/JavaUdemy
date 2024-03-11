//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Ogrenci ogrenci = new Ogrenci("Taha","Adiyaman","1307","Hasan","Ayten","07.07.1993");
        System.out.println(ogrenci.ad);

        OgrenciIslemleri ogrenciIslemleri = new OgrenciIslemleri(ogrenci);
        ogrenciIslemleri.ekle();
    }
}