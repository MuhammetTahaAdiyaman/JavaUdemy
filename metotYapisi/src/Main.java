import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void kendiniTanıt(){
        System.out.println("Adı: Taha");
        System.out.println("soyadı: Adıyaman");
        System.out.println("Yaşadığı Şehir: Konya");
    }

    public static void main(String[] args) {
        //metotlar karmaşıklıktan kurtaran yapılardır.
        //bir çatı aldında topla tekrar tekrar kullan.

//        System.out.println("Adı: Taha");
//        System.out.println("soyadı: Adıyaman");
//        System.out.println("Yaşadığı Şehir: Konya");
//
//        System.out.println("Adı: Taha");
//        System.out.println("soyadı: Adıyaman");
//        System.out.println("Yaşadığı Şehir: Konya");
//
//        System.out.println("Adı: Taha");
//        System.out.println("soyadı: Adıyaman");
//        System.out.println("Yaşadığı Şehir: Konya");

        //yukarıdaki gibi birden fazla yerde kullanmak için tekrar tekrar yapıyı kopyala yapıştır yerine bir metot yazdık onu çağır

        kendiniTanıt();

    }
}