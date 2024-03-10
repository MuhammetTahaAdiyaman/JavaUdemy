//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Ogretmen ogretmen =  new Ogretmen();

        Ogrenci ogrenci = new Ogrenci();

        ogrenci.girisYap("admin","123456");
        ogretmen.girisYap("admin","123456");
    }
}