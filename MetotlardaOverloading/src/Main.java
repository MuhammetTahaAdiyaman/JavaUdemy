//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void puanYazdir(String kullaniciAdi, int puan){
        System.out.println(kullaniciAdi + " isimli kullanicinin puani: "+ puan);
    }
    public static void puanYazdir(String kullaniciAdi){
        System.out.println(kullaniciAdi + " isimli kullanicinin puani: 0 ");
    }

    public static void puanYazdir(int puan){
        System.out.println("isimsiz kullanicinin puani: "+ puan);
    }
    public static void puanYazdir(){
        System.out.println("isimsiz kullanicinin puani: 0");
    }
    public static void main(String[] args) {
        puanYazdir("Taha",90);
        puanYazdir("Muhammet");
        puanYazdir(90);
        puanYazdir();
    }
}