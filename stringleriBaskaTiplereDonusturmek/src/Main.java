//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String sayi1 = "123456789";

        //long veri tipine dönüştürmek isteyelim
        long longSayi = Long.parseLong(sayi1);
        System.out.println(longSayi+10);

        //bir diğer yöntem ise
        longSayi = Long.valueOf(sayi1);
        System.out.println(longSayi+10);


        //ondalıklı sayı tipine dönüştürmek için
        String ondalıklı = "2.4";
        float fondalik = Float.parseFloat(ondalıklı);
        System.out.println(fondalik+10);
        //bir diğer yöntem ise value of
        fondalik = Float.valueOf(ondalıklı);
        System.out.println(fondalik+10);

        //double a dönüştürmek için
        double ondalikli = Double.parseDouble(ondalıklı);
        System.out.println(ondalikli+10);

        System.out.println("*******************************");

        //double veri tipini int veri tipine dönüştürebiliriz.
        double ondalikd = 27.5;
        int tam = (int) ondalikd;
        System.out.println(tam);


    }
}