public abstract class Kullanici {
    public void girisYap(String kullaniciAdi,String sifre){
        if(kullaniciAdi.equals("admin") && sifre.equals("1234")){
            System.out.println("Başarılı şekilde giriş yapıldı");
        }else{
            System.out.println("Başarısız giriş yapılmadı");
        }
    }
    //her kullanıcı için kayıt olmak farklı öğrenciye tc vs sorarken ogretmene vergi no vs
    abstract void kayitOl();

}
