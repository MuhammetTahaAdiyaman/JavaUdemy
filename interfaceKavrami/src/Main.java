//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
        interface içine yazdığımız her methodlar zorunlu olarak override edilmelidir.
         */

        Ogrenci ogrenci = new Ogrenci();
        ogrenci.girisYap("admin","1234");
        ogrenci.kayitOl();
        ogrenci.sikayetEt();

        Ogretmen ogretmen = new Ogretmen();
        ogretmen.kayitOl();
    }
}