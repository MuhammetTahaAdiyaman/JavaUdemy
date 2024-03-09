//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Kullanici kullanici = new Kullanici();
        System.out.println(kullanici.getIsim());

        //şimdi set metodunu kullanarak class ismine atama yapalım
        kullanici.setIsim("Taha");
        //şimdi tekrardan get isim ile ekrana yazdıralım
        System.out.println(kullanici.getIsim());

        kullanici.setYas(99);
        System.out.println(kullanici.getYas());


    }
}