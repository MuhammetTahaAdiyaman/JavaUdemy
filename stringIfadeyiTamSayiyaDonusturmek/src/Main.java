import java.net.Inet4Address;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String sayi = "45";

        //matematiksel işlem yapamayacağız
        System.out.println(sayi+10); //birleştirdi

        //şu şekilde çevirebiliriz

        int tamSayi = Integer.parseInt(sayi);
        System.out.println(tamSayi+10);

        //aynı görevi gören başka bir method ise
        tamSayi = Integer.valueOf(sayi);
        int toplam = tamSayi+10;
        System.out.println(toplam);

    }
}