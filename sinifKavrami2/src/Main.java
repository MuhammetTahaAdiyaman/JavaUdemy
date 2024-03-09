//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Telefon telefon = new Telefon();
        telefon.aramaYap(234235);
        telefon.aramaKabulEt();
        System.out.println(telefon.marka);
        System.out.println(telefon.model);
        System.out.println(telefon.uretimYili);
        System.out.println(telefon.ekranBoyutu);
    }
}