//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
        abstract sınıflar aslında overriding kavramını öğrenmiştik. super class içinde yer alan bir methodu subclasslar bazında özelleştiriyorduk buna da overriding deniyordu
        yazacağımız abstract sınıfları ile bunu zorunlu hale getireceğiz bir abstract method yazacağız eğer sen bu sınıfı super sınıf olarak seçtiysen bundan subclass tanımlayacaksan
        benim yazdığım abstract methodları kendine göre değiştirmen gerekiyor.
         */

        Ogretmen ogretmen = new Ogretmen();
        Ogrenci ogrenci = new Ogrenci();

        ogrenci.girisYap("admin","1234");
        ogrenci.kayitOl();

        ogretmen.kayitOl();

    }

}