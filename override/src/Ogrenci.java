public class Ogrenci extends Kullanici {
    public int kursSayisi;

    public void puanVer(){
        System.out.println("Puan verildi.");
    }

    //overriding yapalım ve öğrenci giriş yapınca öğrenci paneline yönlendirsin.

    @Override
    public void girisYap(String kullaniciAdi, String sifre) {
        if(kullaniciAdi.equals("admin")&&sifre.equals("123456")){
            System.out.println("Giriş başarılı Öğrenci paneline yönlendiriliyorsunuz");
        }else{
            System.out.println("Giriş başarısız");
        }
    }
}
