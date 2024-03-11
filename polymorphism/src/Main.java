//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //heapte bulunan newli bölümü alt sınıflara eşitleyebilirim.
//        Hayvan hayvan = new Kopek();
//        hayvan.sesCikar();
    Hayvan hayvan  = new Hayvan();
    Kopek kopek = new Kopek();
    Kedi kedi = new Kedi();
    HayvanYonetimi hayvanYonetimi = new HayvanYonetimi(kedi);
    hayvanYonetimi.sesVer();

    }
}