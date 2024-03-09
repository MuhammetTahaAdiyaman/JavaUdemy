//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Veritabani veritabani = new Veritabani();

        veritabani.ekle();
        veritabani.sil();
        veritabani.guncelle();

        System.out.println("**********************************");

        Muhasebe muhasebe = new Muhasebe();
        muhasebe.paraEkle(1000);
        muhasebe.paraCek(300);
        muhasebe.toplamParaGoster();
    }
}