//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static double ortalamaBul(int sayi1, int sayi2){
        int toplam = sayi1+sayi2;
        double ortalama = toplam / 2;
        return ortalama;
    }
    public static void main(String[] args) {
        //geriye döndüren metotları genellikle matematiksel işlemlerde kullanırız
        //bu metot sayesinde biz değeri dışarı aktarırız ve dışarıda istediğimiz şekilde kullanım sağlatabiliriz.
        //direkt ekrana çıktı vermez çünkü metot içinde bir sout yapmıyoruz return yapıyoruz
        //biz döndürdüğümüz değeri main içinde değişkene atayıp ekrana bastırabiliriz.
        double sonuc = ortalamaBul(10,20);
        System.out.println("Ortalama:"+sonuc);
    }
}