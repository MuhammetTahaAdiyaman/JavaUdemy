public class Kullanici {
    public String kullaniciAdi;
    public String sifre;

    public void girisYap(String kullaniciAdi,String sifre){
        if(kullaniciAdi.equals("admin")&&sifre.equals("123456")){
            System.out.println("Giriş başarılı");
        }else{
            System.out.println("Giriş başarısız");
        }
    }

    public void mesajGonder(){
        System.out.println("Mesaj Gonderildi");
    }

    //override etmek aslında temel olarak super classs içinde bulunan bir methodun extend edilen class içinde tekrar yazılıp her class'a göre kendine özel kılmaktır.
    //örneğin öğretmen giriş yaptığında öğretmen paneline yönlendirme işlemi ile öğrenci giriş yaptığında öğrenci paneline yönlendirme işlemini override ile yapabilriz.
    //ikiside giriş yapıyor eğer biz bunu Kullanici class'ı içinde yaparsak ikiside aynı yere yönlendirmiş olacağız bunu override etmeliyiz ki özelleştirebilelim.

}
