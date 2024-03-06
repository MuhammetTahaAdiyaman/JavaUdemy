//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //metinsel ifadeler ile işlem yapabilme veya onlar hakkında bilgi sağlayabilmek adına java geliştiricilerinin hazırlamış olduğu metotlardan bahsedeceğiz.
        String isim = " Bahadır Sevim ";

        //bir stringin uzunluğunu gösterir.
        isim.length(); //çalıştırdığımızda hiç bir şey yazmadı geri döndüren bir metot.
        System.out.println(isim.length());

        //tüm harfleri büyük yazmak için.
        isim.toUpperCase(); //bu da geri döndüren bir metot olduğu için
        String buyukIsim = isim.toUpperCase();
        System.out.println(buyukIsim);

        //tüm harfleri küçük harfe çevirmede de kullandığımız metot ise;
        isim.toLowerCase();
        System.out.println(isim.toLowerCase());

        //metinsel ifadenin başındaki ve sonundaki boşlukları silen metot ise;
        System.out.println(isim.trim());

        String ad = "Taha";
        ad = ad.concat(" ");
        String soyad = "Adiyaman";

        //iki metinsel ifadeyi birleştiren metot ise;
        String tamIsim = ad.concat(soyad);
        System.out.println(tamIsim);

        //metinsel ifadede belirli konumdaki karakteri getirmek istersek eğer
        System.out.println(isim.charAt(4));

        //değeri vereyim kaçinci indekste olduğunu belirtsin.
        System.out.println(isim.indexOf("d"));

        //belirli konumdan sonraki karakterleri göstermesini de isteyebiliriz.
        isim.substring(1,4);
        System.out.println(isim.substring(1,4));

        //metinsel ifade içinde bir değer aramak istersek;
        isim.contains("Sevim");
        System.out.println(isim.contains("Sevim"));

        //bizim istediğimiz karakteri başka bir karaqkter ile değiltirmek istersek
        isim = isim.replace("Sevim","Adıyaman");
        System.out.println(isim);

        //karakteri bölüp diziye aktarmak için;
        String cumle = "Ne mutlu türküm diyene";
        String[] kelimeler = cumle.split(" ");
        for(int i=0; i<kelimeler.length; i++){
            System.out.println(kelimeler[i]);
        }
    }
}