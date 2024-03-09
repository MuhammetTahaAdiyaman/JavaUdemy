//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //nesnemizi oluşturalım
        Ogrenci ogrenci = new Ogrenci();

        //nesnemizin özelliklerine setter metodu ile erişip değer ataması gerçekleştirelim
        ogrenci.setAd("Gülşen");
        ogrenci.setSoyad("Sevim");
        ogrenci.setOkulNo(2145);
        ogrenci.setDogumYili(1999);

        //bunları get ile tek tek ekrana bastırmamız mantıklı mı ? hemen class'a gidip bir toplu ekrana bastırma methodu yazalım
        //şimdi metodu çağıralım.
        ogrenci.bilgileriGoster();
        //peki bu da mantıklı mı ? yani gidip özel bir başka metodu oluşturup çağırmamıza gerek var mı?
        //bunun için özel bir metodumuz var tostring() metodu onu görelim hemen class'a gidip.
        System.out.println("***********************************");
        //toString() metodunu şu şekilde çağırıyoruz.
        System.out.println(ogrenci);
    }
}