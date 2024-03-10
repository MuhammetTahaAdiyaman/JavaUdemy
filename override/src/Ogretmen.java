public class Ogretmen extends Kullanici {
    public int ogretmenNo;
    public double puan;
    public int bakiye;

    public void ogrencileriListele(){
        System.out.println("Ogrenciler listelendi");
    }

    public void paraCek(int miktar){
        this.bakiye -= miktar;
        System.out.println("Para çekildi"+this.bakiye);
    }

    //overrride işlemini gerçekleştirelim ve öğretmen giriş yaptığında öğretmen paneline yönlendirsin

    @Override
    public void girisYap(String kullaniciAdi, String sifre) {
        if(kullaniciAdi.equals("admin") && sifre.equals("123456")){
            System.out.println("Giriş başarılı. Öğretmen paneline yönlendiriliyorsunuz");
        }else{
            System.out.println("Giriş başarısız");
        }
    }
}
